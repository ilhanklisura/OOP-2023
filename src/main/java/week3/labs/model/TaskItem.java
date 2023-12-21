package week3.labs.model;

import week3.labs.enums.TaskStatus;

// TaskItem class representing a task entity
public class TaskItem {
    private int taskId;
    private String taskDescription;
    private TaskStatus taskStatus;

    public TaskItem(int taskId, String taskDescription, TaskStatus taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }
}

