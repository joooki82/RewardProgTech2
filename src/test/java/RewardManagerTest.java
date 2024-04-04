import hu.jakab.prototypeDesignPattern.Child;
import hu.jakab.strategyDesignPattern.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardManagerTest {

    private RewardManager manager;
    private Child child;

    @BeforeEach
    void setUp() {
        manager = RewardManager.getInstance();
        child = new Child("Andris");
        manager.addChild(child);
    }

    @Test // Az elvárt eredmény az, hogy a gyermek pontszáma 0, mivel nincsenek feladatok hozzárendelve.
    void testAddChildAndListPointsWithNoTasks() {
        manager.listChildPoints();
        assertEquals(0, child.getPoints(), "A gyermek pontszáma nem 0, amikor nincsenek hozzárendelve feladatok.");
    }

    @Test
    void testAddAndAssignTasks() {
        Task cleanRoomTask = new HouseHoldTask("Clean Room", "Clean your room thoroughly", 10);
        manager.addTask(cleanRoomTask);
        manager.assignTaskToChild("Andris", "Clean Room");
        manager.calculatePointsForChild("Andris");
        assertEquals(10, child.getPoints(), "A gyermek pontszáma nem a várt érték a feladat hozzárendelése után.");
    }

    @Test
    void testCalculatePointsForChildWithMultipleTasks() {
        Task cleanRoomTask = new HouseHoldTask("Clean Room", "Clean your room thoroughly", 10);
        Task mathHomework = new StudyingTask("Math Homework", "Complete all math exercises", 20);
        manager.addTask(cleanRoomTask);
        manager.addTask(mathHomework);
        manager.assignTaskToChild("Andris", "Clean Room");
        manager.assignTaskToChild("Andris", "Math Homework");
        manager.calculatePointsForChild("Andris");
        assertEquals(30, child.getPoints(), "A gyermek összpontszáma nem a várt érték több feladat hozzárendelése után.");
    }

    @Test
    public void testCalculatePointsStandard() {
        PointCalculationStrategy strategy = new StandardPointStrategy();
        int basePoints = 100;
        int calculatedPoints = strategy.calculatePoints(basePoints);
        assertEquals(basePoints, calculatedPoints, "A kiszámított pontoknak meg kell egyeznie a StandardPointStrategy alappontjaival.");
    }

    @Test
    public void testCalculatePointsBonus() {
        PointCalculationStrategy strategy = new BonusPointStrategy();
        int basePoints = 100;
        int expectedPoints = (int) (basePoints * 2.5);
        int calculatedPoints = strategy.calculatePoints(basePoints);
        assertEquals(expectedPoints, calculatedPoints, "A kiszámított pontoknak a BonusPointStratégia esetében a bázispontok 2,5-tel való szorzatának kell lenniük.");
    }
}
