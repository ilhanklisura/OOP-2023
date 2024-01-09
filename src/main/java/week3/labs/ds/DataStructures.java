package week3.labs.ds;

import week3.labs.enums.TaskStatus;
import week3.labs.model.TaskItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks;

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskStatus.COMPLETED));
    }

    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(TaskStatus taskStatus) {
        List<TaskItem> filteredTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskStatus() == taskStatus) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public List<TaskItem> findTasksById(int taskId) {
        List<TaskItem> foundTasks = new ArrayList<>();
        for (TaskItem task : tasks) {
            if (task.getTaskId() >= taskId) {
                foundTasks.add(task);
            }
        }
        return foundTasks;
    }

    public void printTaskDescriptions() {
        tasks.forEach(task ->
                System.out.println(task.getTaskDescription()));
    }
}

