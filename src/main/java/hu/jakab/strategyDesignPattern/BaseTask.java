package hu.jakab.strategyDesignPattern;

public abstract class BaseTask implements Task {
    protected String name;
    protected String description;
    protected int points;
    protected PointCalculationStrategy pointStrategy = new StandardPointStrategy(); // Alapértelmezett stratégia

    public BaseTask(String name, String description, int points) {
        this.name = name;
        this.description = description;
        this.points = points;
    }

    @Override
    public void setPointCalculationStrategy(PointCalculationStrategy strategy) {
        this.pointStrategy = strategy;
    }

    @Override
    public int getPoints() {
        return pointStrategy.calculatePoints(this.points);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public void performTask() {
        System.out.println("A " + name + " elvégezve!");
    }
}
