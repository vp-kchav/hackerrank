package intuit.taskscheduling;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Task {
    private int taskId;
    private String description;
    private Date dueDate;
    private String assignment;

    LinkedList<Task> dependencies;

    boolean isCompleted = false;

    public int getTaskId() {
        return taskId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Task(int id, String description) {
        this.taskId = id;
        this.description = description;
        this.dependencies = new LinkedList<>();
    }

    public void setDescription( String description) {
        this.description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public void setDependencies(LinkedList<Task> dependencies) {
        this.dependencies = dependencies;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getAssignment() {
        return assignment;
    }


    public List<Task> getDependencies() {
        return dependencies;
    }

    public void addDependecy(Task task) {
        getDependencies().add(task);
    }
    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", dependencies=" + dependencies +
                '}';
    }
}
