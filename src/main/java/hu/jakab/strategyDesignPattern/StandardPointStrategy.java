package hu.jakab.strategyDesignPattern;

public class StandardPointStrategy implements PointCalculationStrategy {
    @Override
    public int calculatePoints(int basePoints) {
        // Standard strategy without modification
        return basePoints;
    }
}


