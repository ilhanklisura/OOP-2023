package week3.labs;

import week3.labs.db.DbConnect;
import week3.labs.ds.DataStructures;
import week3.labs.enums.TaskStatus;
import week3.labs.model.TaskItem;

public class Main {
    public static void main(String[] args) {
        // Create an instance of DataStructures
        DataStructures ds = new DataStructures();

        // Print all tasks
        System.out.println("All Tasks:");
        ds.getAllTasks().forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        // Print tasks with a specific status (e.g., IN_PROGRESS)
        System.out.println("Tasks In Progress:");
        ds.getByStatus(TaskStatus.IN_PROGRESS).forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        // Print tasks with an ID greater than or equal to 2
        System.out.println("Tasks with ID >= 2:");
        ds.findTasksById(2).forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        // Print task descriptions using forEach stream
        System.out.println("Task Descriptions using forEach:");
        ds.printTaskDescriptions();
        System.out.println();

        // Create an instance of DbConnect
        DbConnect db = new DbConnect();

        // Fetch all tasks from the database
        System.out.println("All Tasks from Database:");
        db.getAllTasksFromDatabase().forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println();

        // Fetch a specific task by ID from the database (e.g., task with ID 2)
        System.out.println("Task from Database with ID 2:");
        TaskItem taskFromDb = db.getTaskById(2);
        if (taskFromDb != null) {
            System.out.println(taskFromDb.getTaskDescription());
        } else {
            System.out.println("Task not found");
        }
    }
}

