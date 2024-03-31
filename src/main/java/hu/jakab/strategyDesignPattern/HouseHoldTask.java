package hu.jakab.strategyDesignPattern;

public class HouseHoldTask implements Task {
    private String name;
    private String description;
    private int points;

    private PointCalculationStrategy pointStrategy = new StandardPointStrategy(); // Default strategy

    @Override
    public void setPointCalculationStrategy(PointCalculationStrategy strategy) {
        this.pointStrategy = strategy;
    }
    @Override
    public int getPoints() {
        return pointStrategy.calculatePoints(this.points);
    }

    public HouseHoldTask(String name, String description, int points) {
        this.name = name;
        this.description = description;
        this.points = points;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public void setPoints(int points) { this.points = points; }

    @Override
    public String toString() {
        return "HouseHoldTask{" +
               "name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", points=" + points +
               '}';
    }

    @Override
    public void performTask() {
        System.out.println("A " + name + " elvégezve!");
    }
}
