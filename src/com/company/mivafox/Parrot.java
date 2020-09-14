package com.company.mivafox;

public class Parrot extends Bird
{
    Parrot(String name, String color, int yearOfBirth, int height)
    {
        super(name, color, yearOfBirth, height);
    }

    void speak()
    {
        System.out.println("want cracker!!!");
    }

    @Override
    void fly()
    {
        System.out.println("can't fly");
    }
}
