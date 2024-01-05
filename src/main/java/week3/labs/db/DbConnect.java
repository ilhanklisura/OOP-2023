package week3.labs.db;

import week3.labs.enums.TaskStatus;
import week3.labs.model.TaskItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/TaskManagementSystem";
    private static final String USERNAME = "root"; // Change as needed
    private static final String PASSWORD = ""; // Change as needed

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Method to fetch all task entities from the database
    public List<TaskItem> getAllTasksFromDatabase() {
        List<TaskItem> tasksFromDatabase = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tasks");

            while (resultSet.next()) {
                int taskId = resultSet.getInt("id");
                String taskDescription = resultSet.getString("task_description");
                String taskStatusStr = resultSet.getString("task_status");
                TaskStatus taskStatus = TaskStatus.valueOf(taskStatusStr);

                TaskItem task = new TaskItem(taskId, taskDescription, taskStatus);
                tasksFromDatabase.add(task);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tasksFromDatabase;
    }

    // Method to fetch a specific task entity by its ID from the database
    public TaskItem getTaskById(int taskId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM tasks WHERE id = ?");
            preparedStatement.setInt(1, taskId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String taskDescription = resultSet.getString("task_description");
                String taskStatusStr = resultSet.getString("task_status");
                TaskStatus taskStatus = TaskStatus.valueOf(taskStatusStr);

                return new TaskItem(taskId, taskDescription, taskStatus);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}