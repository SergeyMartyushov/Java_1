package ru.geekbrains.javaone.lesson_5;

public class Cat extends Animal{

    public Cat(int run, int swim, float jump){
        super(run, swim, jump);
    }

    protected void drive() {
        super.movie("Котик",200,0, 2f);
        if(swim >= 0)
            System.out.println("Кот не умеет плавать");
    }


}
