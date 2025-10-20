package com.example.instructions;

/**
 * Demonstrates placing an instruction before super().
 * In Java, any statement before super() must be a variable declaration,
 * not an executable statement.
 */
class Parent {
    public Parent(String message) {
        System.out.println("Parent constructor: " + message);
    }
}

public class Child extends Parent {

    public Child() {
        // This is allowed: a variable declaration or assignment.
        String initMessage = "Initialized before calling super";

        // The call to super() must still be the first *executable* statement.
        super(initMessage);

        // This runs after the parent constructor.
        System.out.println("Child constructor complete.");
    }

    public static void main(String[] args) {
        new Child();
    }
}
