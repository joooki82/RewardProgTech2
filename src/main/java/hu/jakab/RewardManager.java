package hu.jakab;

import java.util.HashMap;
import java.util.Map;

public class RewardManager implements IRewardManager {
    private static RewardManager instance;
    private Map<String, Child> children = new HashMap<>();
    private Map<String, Task> tasks = new HashMap<>();

    private RewardManager() {}

    public static synchronized RewardManager getInstance() {
        if (instance == null) {
            instance = new RewardManager();
        }
        return instance;
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
            child.setPoints(task.getPoints());
        }
    }

    @Override
    public void listChildPoints() {
        children.forEach((name, child) -> System.out.println(child));
    }
}
