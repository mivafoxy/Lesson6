package com.company.mivafox;

public class Bird extends Animal
{
    private int height;

    Bird(String name, String color, int yearOfBirth, int height)
    {
        super(name, color, yearOfBirth);
        this.height = height;
    }

    public void voice()
    {
        System.out.println(name + " song");
    }

    public void walk()
    {
        System.out.println(name + " walks on paws");
    }

    void fly()
    {
        System.out.println("fly");
    }
}
