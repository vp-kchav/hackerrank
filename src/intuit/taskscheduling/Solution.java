package intuit.taskscheduling;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {

//        * T5 has a dependency with T2
//        * T5 has a dependency with T0
//        * T4 has a dependency with T0
//        * T4 has a dependency with T1
//        * T2 has a dependency with T3
//        * T3 has a dependency with T1

        TaskScheduler taskScheduler = new TaskScheduler();

        /* Add tasks to scheduler */
        taskScheduler.createTask(5,"t5 description");
        taskScheduler.createTask(4,"t4 description");
        taskScheduler.createTask(2,"t2 description");
        taskScheduler.createTask(3,"t3 description");
        taskScheduler.createTask(0,"t0 description");
        taskScheduler.createTask(1,"t1 description");

        taskScheduler.getTaskById(5).addDependecy(taskScheduler.getTaskById(2));
        taskScheduler.getTaskById(5).addDependecy(taskScheduler.getTaskById(0));
        taskScheduler.getTaskById(4).addDependecy(taskScheduler.getTaskById(0));
        taskScheduler.getTaskById(4).addDependecy(taskScheduler.getTaskById(1));
        taskScheduler.getTaskById(2).addDependecy(taskScheduler.getTaskById(3));
        taskScheduler.getTaskById(3).addDependecy(taskScheduler.getTaskById(1));


        LinkedList<Task> takeToComplete = taskScheduler.scheduleTask();
        System.out.println("hello stop here!!");
    }
}
