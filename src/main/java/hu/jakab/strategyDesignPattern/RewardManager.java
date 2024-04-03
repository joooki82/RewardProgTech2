package hu.jakab.strategyDesignPattern;

import hu.jakab.prototypeDesignPattern.Child;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RewardManager implements IRewardManager {
    private static RewardManager instance;
    private Map<String, Child> children = new HashMap<>();
    private Map<String, Task> tasks = new HashMap<>();
    private Map<Child, List<Task>> assignedTasks = new HashMap<>();

    private RewardManager() {}

    public static synchronized RewardManager getInstance() {
        if (instance == null) {
            instance = new RewardManager();
        }
        return instance;
    }

    @Override
    public void addChild(Child child) {
        children.put(child.getName(), child);
    }

    @Override
    public void addTask(Task task) {
        tasks.put(task.getName(), task);
    }


    @Override
    public void assignTaskToChild(String childName, String taskName) {
        Task task = tasks.get(taskName);
        Child child = children.get(childName);
        if (task != null && child != null) {
            assignedTasks.computeIfAbsent(child, k -> new ArrayList<>()).add(task);
        }
    }

    public void calculatePointsForChild(String childName) {
        Child child = children.get(childName);
        if (child != null) {
            int totalPoints = assignedTasks.getOrDefault(child, new ArrayList<>()).stream()
                    .mapToInt(task -> task.getPoints())
                    .sum();
            child.setPoints(totalPoints);
        }
    }

    @Override
    public void listChildPoints() {
        children.forEach((name, child) -> {
            calculatePointsForChild(name);
            System.out.println(child);
        });
    }
}
