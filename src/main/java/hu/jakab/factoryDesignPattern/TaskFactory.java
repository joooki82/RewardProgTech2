package hu.jakab.factoryDesignPattern;

public class TaskFactory implements IfTaskFactory{

    public Task createTask(String taskType, String name, String description, int points) {
        switch (taskType) {
            case "Studying":
                return new StudyingTask(name, description, points);
            case "Sport":
                return new SportTask(name, description, points);
            case "HouseHold":
                return new HouseHoldTask(name, description, points);
            default:
                throw new IllegalArgumentException("Invalid task type: " + taskType);
        }
    }
}
