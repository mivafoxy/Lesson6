package com.company.mivafox;

public class Snake extends Animal
{
    Snake(String name, String color, int yearOfBirth)
    {
        super(name, color, yearOfBirth);
    }

    @Override
    void voice()
    {
        System.out.println(name + " pshhhhhh");
    }

    @Override
    public void walk()
    {
        System.out.println(name + " crawls");
    }
}
