package com.company;

public abstract class Animal {
    private String name;
    private int maxRun;
    private int maxSwim;


    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }
    public void run(int distance){
        if(maxRun < distance){
            System.out.printf("%s too much to run %s m %n", name, distance);
            return;
        }
        System.out.printf("%s run %s m %n", name, distance);
    }

    public void swim(int distance){
        if (maxSwim < distance){
            System.out.printf("%s too much to swim %s m %n %n", name, distance);
            return;
        }
        System.out.printf("%s swim %s m %n %n", name, distance);
    }

    public String getName() {
        return name;
    }
}
