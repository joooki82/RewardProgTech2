package hu.jakab.strategyDesignPattern;

public class BonusPointStrategy implements PointCalculationStrategy {
    @Override
    public int calculatePoints(int basePoints) {

        return (int)(basePoints * 2.5);
    }
}
