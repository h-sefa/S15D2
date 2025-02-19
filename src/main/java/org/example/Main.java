package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Tasks and Collections are created and tasks are added the collections...
        Set<Task> annsTasks = new HashSet<>();
        Set<Task> bobsTasks = new HashSet<>();
        Set<Task> carolsTasks = new HashSet<>();
        Set<Task> unassignedTasks = new HashSet<>();

        Task annTask1 = new Task("proje1","html calisması","ann", Status.ASSIGNED, Priority.LOW);
        annsTasks.add(annTask1);

        Task bobTask1 = new Task("proje2","css calisması","bob", Status.ASSIGNED, Priority.MED);
        bobsTasks.add(bobTask1);

        Task carolTask1 = new Task("proje3","js calisması","carol", Status.ASSIGNED, Priority.LOW);
        carolsTasks.add(carolTask1);

        Task unassignedTask1 = new Task("proje4","react calisması","null", Status.ASSIGNED, Priority.HIGH);
        unassignedTasks.add(unassignedTask1);

        // TaskData object is created
        TaskData taskData = new TaskData(annsTasks,bobsTasks, carolsTasks, unassignedTasks);
        //System.out.println(taskData.getTasks("bob"));


        //System.out.println(annTask1);
        StringSet.findUniqueWords();


    }
}