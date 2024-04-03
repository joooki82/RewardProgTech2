package hu.jakab.builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Létrehoz egy Child példányt a Builder segítségével, pontok nélkül
        Child childWithoutPoints = new Child.Builder("Andris")
                                    .build();

        // Létrehoz egy másik Child példányt, pontokkal
        Child childWithPoints = new Child.Builder("Ádám")
                                 .points(20)
                                 .build();

        System.out.println(childWithoutPoints);
        System.out.println(childWithPoints);
    }
}
