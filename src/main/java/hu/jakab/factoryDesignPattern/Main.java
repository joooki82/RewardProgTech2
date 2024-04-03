package hu.jakab.factoryDesignPattern;


import hu.jakab.prototypeDesignPattern.Child;


public class Main {

    public static void main(String[] args) {
        // Gyártó (factory) példányosítása
        IfTaskFactory taskFactory = new TaskFactory();

        // Létrehoz egy gyermeket a rendszerhez
        Child child = new Child("Alex");

        // Feladatok létrehozása a gyártói minta használatával
        Task houseTask = taskFactory.createTask("HouseHold", "Clean Room", "Clean your room thoroughly", 10);
        Task studyTask = taskFactory.createTask("Studying", "Math Homework", "Complete all math exercises", 20);
        Task sportTask = taskFactory.createTask("Sport", "Football", "Play football for 30 minutes", 15);


        // RewardManager példányosítása és a gyermek, valamint a feladatok hozzáadása
        RewardManager manager = RewardManager.getInstance();
        manager.addChild(child);
        manager.addTask(houseTask);
        manager.addTask(studyTask);
        manager.addTask(sportTask);

        // A feladatok hozzárendelése a gyermekhez
        manager.assignTaskToChild("Alex", "Clean Room");
        manager.assignTaskToChild("Alex", "Math Homework");
        manager.assignTaskToChild("Alex", "Football");

        // A pontok kiszámítása és a gyermek pontjainak listázása
        manager.listChildPoints();
    }

}
