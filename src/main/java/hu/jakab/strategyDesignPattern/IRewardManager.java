package hu.jakab.strategyDesignPattern;

import hu.jakab.Child;

public interface IRewardManager {
    void addChild(Child child);
    void addTask(Task task);
    void assignTaskToChild(String childName, String taskName);
    void listChildPoints();
}
