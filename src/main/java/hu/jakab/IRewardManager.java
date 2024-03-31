package hu.jakab;

public interface IRewardManager {
    public void addChild(Child child);
    void addTask(Task task);
    void assignTaskToChild(String childName, String taskName);
    void listChildPoints();
}
