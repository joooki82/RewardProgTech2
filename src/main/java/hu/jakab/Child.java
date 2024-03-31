package hu.jakab;

public class Child {
    private String name;
    private int points;

    public Child(String name, int points) {
        this.name = name;
        this.points = points;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points += points; } // Pontok hozzáadása

    @Override
    public String toString() {
        return "Child{" +
               "name='" + name + '\'' +
               ", points=" + points +
               '}';
    }
}
