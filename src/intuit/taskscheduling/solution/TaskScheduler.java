package intuit.taskscheduling.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class TaskScheduler {
    private Map<Integer, Task> taskMap;
    private Map<Integer, List<Integer>> taskDependencyMap;

    /* For simplicity set static value of tasks */
    public TaskScheduler() {
        this.taskDependencyMap = new HashMap<>();
        this.taskMap = new HashMap<>();
    }

    /* TaskB is dependent on taskA */
    void addDependency(int taskA, int taskB) throws Exception {

        if(!this.taskDependencyMap.containsKey(taskA)) {
            throw new Exception("Incorrect task dependency");

            /* Other potential exceptions *
             -> duplication of dependencies
             -> Invalid task ids
             */
        }
        this.taskDependencyMap.get(taskA).add(taskB);

    }


    /* Add task to dependency map */
    void createTask(String taskDescription, String dueDate, int uniqueTaskId) {

        Task t = new Task(taskDescription, dueDate, uniqueTaskId);
        this.taskMap.put(t.getTaskId(), t);
        this.taskDependencyMap.put(t.getTaskId(), new ArrayList<>());
    }


    List<Task> scheduleTasks() {

        List<Task> taskList = new ArrayList<>();
        Stack<Integer> stack = new Stack();

        HashSet<Integer> visitedTasks = new HashSet<>();

        /* Call the recursive helper
           function to store
           Topological Sort starting
           from all tasks one by one
        */
        for(Integer taskId : this.taskMap.keySet()) {
            if(!visitedTasks.contains(taskId)) {
                scheduleTaskUtil(taskId, visitedTasks, stack);
            }
        }

        // pop contents of stack
        while (!stack.empty()) {
            taskList.add(this.taskMap.get(stack.pop()));
        }

        return taskList;

    }

    private void scheduleTaskUtil(int taskId, HashSet<Integer> visitedTasks, Stack<Integer> stack) {

        /* Add taskId to visited */
        visitedTasks.add(taskId);
        Integer thisTask;

        /* Fetch all dependencies of taskId */
        Iterator<Integer> it = this.taskDependencyMap.get(taskId).iterator();

        while (it.hasNext()) {
            thisTask = it.next();
            if (!visitedTasks.contains(thisTask)) {
                scheduleTaskUtil(thisTask, visitedTasks , stack);
            }

        }

        // Push current taskId to stack
        stack.push(taskId);
    }
}
