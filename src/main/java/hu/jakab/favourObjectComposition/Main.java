package hu.jakab.favourObjectComposition;

import hu.jakab.prototypeDesignPattern.Child;

public class Main {
    public static void main(String[] args) {
        RewardManager rewardManager = RewardManager.getInstance();

        // Gyerekek létrehozása és hozzáadása
        Child child1 = new Child("Andris");
        Child child2 = new Child("Ádám");
        rewardManager.addChild(child1);
        rewardManager.addChild(child2);

        // Feladatok létrehozása
        Task houseTask = new HouseHoldTask("Takarítás", "A nappali takarítása", 50);
        Task sportTask = new SportTask("Futás", "5 km futás a parkban", 100);
        Task studyingTask = new StudyingTask("Matek házi", "A matek házi megoldása", 75);

        // Feladatok hozzáadása
        rewardManager.addTask(houseTask);
        rewardManager.addTask(sportTask);
        rewardManager.addTask(studyingTask);

        // Feladatok kiosztása
        rewardManager.assignTaskToChild("Andris", "Takarítás");
        rewardManager.assignTaskToChild("Ádám", "Futás");
        rewardManager.assignTaskToChild("Andris", "Matek házi");

        // Gyerekek pontszámának kiírása előtt és után
        System.out.println("Pontszámok a feladatok kiosztása előtt:");
        rewardManager.listChildPoints();

        // Pontszámok kiszámítása
        rewardManager.calculatePointsForChild("Andris");
        rewardManager.calculatePointsForChild("Ádám");

        System.out.println("Pontszámok a feladatok teljesítése után:");
        rewardManager.listChildPoints();
    }

}
