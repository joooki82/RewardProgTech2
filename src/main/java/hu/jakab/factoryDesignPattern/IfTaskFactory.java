package hu.jakab.factoryDesignPattern;

public interface IfTaskFactory {
    Task createTask(String taskType, String name, String description, int basePoints);
}

