package ru.geekbrains.javaone.lesson_5;

public class Animal {
    protected int run;
    protected int swim;
    protected float jump;

    public Animal(){
    }

    protected Animal(int run, int swim, float jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    protected void drive(){
    }

    protected void movie(String name, int x, int y, float z){
        if(run <= x)
            System.out.println(name + " побежал " + run + " м.");
        if(swim <= y)
            System.out.println(name + " проплыл " + swim + " м.");
        if(jump <= z)
            System.out.println(name + " запрыгнул на высоту " + jump + " м.");
    }
}
