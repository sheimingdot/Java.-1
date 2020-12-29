package com.company;

public class Main {
    public static void main(String[] args){
        Cat[] cat = {new Cat ("Kat1"),
                new Cat("Kat2"),
                new Cat("Kat3")
        };
        Dog[] dog = {new Dog ("Dog1"),
                new Dog("Dog2")
        };
        int sumAnimal = cat.length + dog.length;

        cat[0].run(300);
        cat[0].swim(10);
        dog[0].run(600);
        dog[0].swim(5);

        cat[1].run(150);
        cat[1].swim(1);
        dog[1].run(480);
        dog[1].swim(8);

        cat[2].run(270);
        cat[2].swim(0);

        System.out.println("Sum of animals:" + sumAnimal);
        System.out.println("Sum of Dogs:" + dog.length);
        System.out.println("Sum of Cats:" + cat.length);
    }
}
