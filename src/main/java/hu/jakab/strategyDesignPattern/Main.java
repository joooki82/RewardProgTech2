package hu.jakab.strategyDesignPattern;


import hu.jakab.prototypeDesignPattern.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Alex");

        Task houseTask = new HouseHoldTask("Clean Room", "Clean your room thoroughly", 10);
        Task studyTask = new StudyingTask("Math Homework", "Complete all math exercises", 20);

        // Assign a bonus strategy to studying task
        studyTask.setPointCalculationStrategy(new BonusPointStrategy());

        RewardManager manager = RewardManager.getInstance();
        manager.addChild(child);
        manager.addTask(houseTask);
        manager.addTask(studyTask);

        manager.assignTaskToChild("Andris", "Clean Room");
        manager.assignTaskToChild("Andris", "Math Homework");

        // Calculate and list points after applying strategies
        manager.listChildPoints();
    }

}
