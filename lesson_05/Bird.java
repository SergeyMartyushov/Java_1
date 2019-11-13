package ru.geekbrains.javaone.lesson_5;

public class Bird extends Animal {

    public Bird(int run, int swim, float jump){
        super(run, swim, jump);
    }
    protected void drive() {
        super.movie("Птица",5,0, 0.2f);
        if(swim >= 0)
            System.out.println("Кот не умеет плавать");
    }
}
