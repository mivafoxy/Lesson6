package com.company.mivafox;

public class Dog extends Animal
{
    Dog(String name, String color, int yearOfBirth)
    {
        super(name, color, yearOfBirth);
    }

    public void voice()
    {
        System.out.println(name + " baws");
    }

    public void walk()
    {
        System.out.println(name + " walks on paws");
    }
}
