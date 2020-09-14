package com.company.mivafox;

public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = getAnimals();

        for (int i = 0; i < animals.length; i++)
        {
            if (animals[i] instanceof Parrot)
            {
                Parrot p = (Parrot) animals[i];
                p.speak();
            }

            animals[i].voice();

        }
    }

    static Animal[] getAnimals()
    {
        Cat cat = new Cat("Dusya", "Gray", 2020);
        Dog dog = new Dog("Tuzik", "Black", 2013);
        Bird bird = new Bird("Chijik", "yellow", 2019, 10);
        Parrot parrot = new Parrot("Polly", "raindbow", 2015, 0);

        Animal[] animals = { cat, dog, bird, parrot };

        return animals;
    }
}
