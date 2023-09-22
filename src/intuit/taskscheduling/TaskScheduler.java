package intuit.taskscheduling;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskScheduler {

    LinkedList<Task> tasks;

    public TaskScheduler() {
        this.tasks = new LinkedList<>();
    }

    public void createTask(int taskId, String description) {
        Task newTask = new Task(taskId ,description);
        tasks.add(newTask);
    }

    public Task getTaskById(int id) {
        return tasks.stream().filter(task -> task.getTaskId()==id).findFirst().get();
    }

    public LinkedList<Task> scheduleTask() {
        List<Integer> visitedTask = new ArrayList<>();
        List<Integer> addedTasks = new ArrayList<>();
        LinkedList<Task> tasksOrdering = new LinkedList<>();

        while(!tasks.isEmpty()) {
            scheduleUtil(visitedTask, tasks.remove(), tasksOrdering, addedTasks);
        }
        return tasksOrdering;
    }

    public void scheduleUtil(List<Integer> visitedTasks, Task task,LinkedList<Task> tasksOrdering, List<Integer> addedTasks) {
        if(task.getDependencies().isEmpty()) {
            if(!addedTasks.contains(task.getTaskId())) {
                tasksOrdering.add(task);
                addedTasks.add(task.getTaskId());
            }
        } else {
            visitedTasks.add(task.getTaskId());
            for (Task task1 : task.getDependencies()) {
                scheduleUtil(visitedTasks, task1, tasksOrdering, addedTasks);
            }
        }
        if(!addedTasks.contains(task.getTaskId())) {
            tasksOrdering.add(task);
            addedTasks.add(task.getTaskId());
        }
    }

}
