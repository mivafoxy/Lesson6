package com.company.mivafox;

public abstract class Animal
{
    protected String name;
    protected String color;
    protected int yearOfBirth;

    Animal(String name, String color, int yearOfBirth)
    {
        this.name = name;
        this.color = color;
        this.yearOfBirth = yearOfBirth;
    }

    abstract void voice();

    void walk()
    {
        System.out.println(name + " walks on paws");
    }
}
