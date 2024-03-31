package hu.jakab.strategyDesignPattern;

public interface Task {
    void performTask();
    int getPoints();
    String getName();
    void setPointCalculationStrategy(PointCalculationStrategy strategy);
}
