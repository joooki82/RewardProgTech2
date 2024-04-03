package hu.jakab.builderDesignPattern;

public class Child {
    private String name;
    private int points;

    private Child(Builder builder) {
        this.name = builder.name;
        this.points = builder.points;
    }

    public String getName() { return name; }
    public int getPoints() { return points; }

    @Override
    public String toString() {
        return "Child{" +
               "name='" + name + '\'' +
               ", points=" + points +
               '}';
    }

    public static class Builder {
        private String name;
        private int points = 0; // alapértelmezett érték

        public Builder(String name) {
            this.name = name;
        }

        public Builder points(int points) {
            this.points = points;
            return this;
        }

        public Child build() {
            return new Child(this);
        }
    }
}
