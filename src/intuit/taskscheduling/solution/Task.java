package intuit.taskscheduling.solution;

public class Task {
    private int uniqueTaskId;
    private String taskDescription;
    private String dueDate;
    private String notes;
    private String assignee;


    /* For simplicity adding uniqueTaskId in constructor */
    public Task(String taskDescription, String dueDate, int uniqueTaskId) {
        this.uniqueTaskId = uniqueTaskId;
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
    }


    public int getTaskId() {
        return uniqueTaskId;
    }


    @Override
    public String toString() {
        return "Task{" +
                "uniqueTaskId=" + uniqueTaskId +
                ", taskDescription='" + taskDescription + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}
