package hu.jakab.strategyDesignPattern;

public class StandardPointStrategy implements PointCalculationStrategy {
    @Override
    public int calculatePoints(int basePoints) {
        return basePoints;
    }
}


