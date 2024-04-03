package hu.jakab.programToInterface;

import hu.jakab.prototypeDesignPattern.Child;

public class Main {
    public static void main(String[] args) {
        // Singleton példány létrehozása a RewardManager számára
        RewardManager rewardManager = RewardManager.getInstance();

        // Feladatok létrehozása
        Task householdTask = new HouseHoldTask("Szoba takarítás", "A gyerek szobájának kitakarítása", 5);
        Task sportTask = new SportTask("Futás", "30 perc futás a parkban", 10);
        Task studyingTask = new StudyingTask("Matek házi", "A matek házi feladat megoldása", 15);

        // Feladatok hozzáadása a RewardManagerhez
        rewardManager.addTask(householdTask);
        rewardManager.addTask(sportTask);
        rewardManager.addTask(studyingTask);

        // Gyerekek létrehozása
        Child child1 = new Child("Anna");
        Child child2 = new Child("Béla");

        // Gyerekek hozzáadása a RewardManagerhez (kézzel implementált módszerrel)
        rewardManager.addChild(child1);
        rewardManager.addChild(child2);

        // Feladatok hozzárendelése a gyerekekhez
        rewardManager.assignTaskToChild("Anna", "Szoba takarítás");
        rewardManager.assignTaskToChild("Béla", "Futás");
        rewardManager.assignTaskToChild("Anna", "Szoba takarítás");
        rewardManager.assignTaskToChild("Béla", "Futás");
        rewardManager.assignTaskToChild("Anna", "Szoba takarítás");
        rewardManager.assignTaskToChild("Béla", "Futás");
        rewardManager.assignTaskToChild("Anna", "Szoba takarítás");
        rewardManager.assignTaskToChild("Béla", "Futás");

        // A feladatok elvégzése
        householdTask.performTask();
        sportTask.performTask();
        studyingTask.performTask();

        // Gyerekek pontszámának listázása
        rewardManager.listChildPoints();
        rewardManager.listChildPoints();
        rewardManager.listChildPoints();

    }

}
