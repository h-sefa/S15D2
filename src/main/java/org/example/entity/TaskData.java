package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    // Instance variable olarak set collections eklenirken new keyword u ile tanımlamak doğru mu?
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks ;
    private Set<Task> carolsTasks  ;
    private Set<Task> unassignedTasks   ;


    //Constructor
    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }


    //Getter Methods


    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getTasks(String personName){

        switch (personName) {
            case "ann" -> {
                return getAnnsTasks();
            }
            case "bob" -> {
                return getBobsTasks();
            }
            case "carol" -> {
                return getCarolsTasks();
            }
            default -> {
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            }
        }


    }




    // Process
    public Set<Task> getUnion(Set<Task> task1, Set<Task> task2) {
        Set<Task> unionTask = new HashSet<>(task1);
        unionTask.addAll(task2);
        return unionTask;
    }

    public Set<Task> getIntersection(Set<Task> taskOne, Set<Task> taskTwo) {
        Set<Task> intersectTask = new HashSet<>(taskOne);
        intersectTask.retainAll(taskTwo);
        return intersectTask;
    }

    public Set<Task> getDifferences(Set<Task> taskOne, Set<Task> taskTwo) {
        Set<Task> diffrencesTask = new HashSet<>(taskOne);
        diffrencesTask.removeAll(taskTwo);
        return diffrencesTask;
    }
}
