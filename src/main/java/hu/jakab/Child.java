package hu.jakab;

public class Child {
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
}
