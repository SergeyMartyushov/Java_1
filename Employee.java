package ru.geekbrains.javaone.lesson_4;

import java.util.Arrays;

public class Employee {
    public String name;
    public String post;
    public int phoneNumber;
    public int salary;
    public int age;

    public Employee(){

    }

    public Employee(String name, String post, int phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    String getName(){
        return name;
    }

    String getPost(){
        return post;
    }

    int getPhoneNumber(){
        return phoneNumber;
    }

    int getSalary(){
        return salary;
    }

    int getAge(){
        return age;
    }

}
