package com.company.mivafox;

public class Cat extends Animal
{
    Cat(String name, String color, int yearOfBirth)
    {
        super(name, color, yearOfBirth);
    }

    @Override
    void voice()
    {
        System.out.println(name + " meow");
    }


}
