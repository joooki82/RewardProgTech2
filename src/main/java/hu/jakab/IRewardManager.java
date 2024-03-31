package hu.jakab;

public interface IRewardManager {
    void addTask(Task task);
    void assignTaskToChild(String childName, String taskName);
    void listChildPoints();
}
