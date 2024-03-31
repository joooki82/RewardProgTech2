package hu.jakab.favourObjectComposition;


import hu.jakab.Child;

public class Main {
    public static void main(String[] args) {
        RewardManager rewardManager = RewardManager.getInstance();

        // Gyerekek létrehozása és hozzáadása
        Child child1 = new Child("Anna");
        Child child2 = new Child("Béla");
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
        rewardManager.assignTaskToChild("Anna", "Takarítás");
        rewardManager.assignTaskToChild("Béla", "Futás");
        rewardManager.assignTaskToChild("Anna", "Matek házi");

        // Gyerekek pontszámának kiírása előtt és után
        System.out.println("Pontszámok a feladatok kiosztása előtt:");
        rewardManager.listChildPoints();

        // Pontszámok kiszámítása
        rewardManager.calculatePointsForChild("Anna");
        rewardManager.calculatePointsForChild("Béla");

        System.out.println("Pontszámok a feladatok teljesítése után:");
        rewardManager.listChildPoints();
    }

}
