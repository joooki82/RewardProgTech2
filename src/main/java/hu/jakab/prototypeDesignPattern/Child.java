package hu.jakab.prototypeDesignPattern;

public class Child implements Cloneable{
    private String name;
    private int points;

    public Child(String name) {
        this.name = name;
        this.points = 0;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }

    @Override
    public String toString() {
        return "Child{" +
               "name='" + name + '\'' +
               ", points=" + points +
               '}';
    }

    @Override
    public Child clone() {
        try {
            return (Child) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
