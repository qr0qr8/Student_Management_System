package com.university.models;

import java.io.Serializable;

/**
 * Abstract class representing a Person.
 * It uses Encapsulation with private attributes and public getters/setters.
 * It implements Serializable to allow its objects to be written to files.
 */
public abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributes (Encapsulation)
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name; // 'this' keyword to refer to the current object's instance variable
        this.id = id;
    }

    // Getters and Setters (Access Modifiers)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Abstract Method - to be implemented by subclasses (Polymorphism)
    public abstract String getDetails();
}
