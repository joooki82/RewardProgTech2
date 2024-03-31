package hu.jakab.favourObjectComposition;

public class StudyingTask implements Task {
    private TaskDetails taskDetails;

    public StudyingTask(String name, String description, int points) {
        this.taskDetails = new TaskDetails(name, description, points);
    }

    @Override
    public void performTask() {
        System.out.println("A " + getTaskDetails().getName() + " elvégezve!");
    }

    @Override
    public TaskDetails getTaskDetails() {
        return taskDetails;
    }
}
