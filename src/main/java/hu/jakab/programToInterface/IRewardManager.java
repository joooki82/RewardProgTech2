package hu.jakab.programToInterface;

import hu.jakab.Child;
import hu.jakab.programToInterface.Task;

public interface IRewardManager {
    public void addChild(Child child);
    void addTask(Task task);
    void assignTaskToChild(String childName, String taskName);
    void listChildPoints();
}
