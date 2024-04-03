package hu.jakab.prototypeDesignPattern;

public class Main {
    public static void main(String[] args) {

        Child originalChild = new Child("Andris");
        originalChild.setPoints(10);

        System.out.println("Eredeti Child: " + originalChild);

        Child clonedChild1 = null;

        try {
            clonedChild1 = originalChild.clone();
            clonedChild1.setName("Ádám");
            clonedChild1.setPoints(20);

            System.out.println("Klónozott Child 1: " + clonedChild1);

        } catch (Exception e) {
            System.err.println("Klónozás sikertelen: " + e.getMessage());
        }

        originalChild.setPoints(5);
        System.out.println("Módosított eredeti Child: " + originalChild);
        System.out.println("Klónozott Child 1 (módosítás után): " + clonedChild1);
    }
}
