package ru.geekbrains.javaone.lesson_4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee alyosha = new Employee("Alyosha", "bogatyr", 1111111, 50000, 25);

        System.out.println(alyosha.getName());
        System.out.println(alyosha.getPost());

        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Alyosha", "bogatyr", 1111111, 50000, 25);
        emp[1] = new Employee("Yulius", "heroic horse", 2222222, 40000, 41);
        emp[2] = new Employee("Tikhon", "mentor", 3333333, 30000, 55);
        emp[3] = new Employee("Granny", "grandmother", 4444444, 20000, 60);
        emp[4] = new Employee("Lubava", "bride", 5555555, 10000,20);

        output(emp);
        up(emp);
    }

    private static void output(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].age > 40)
            System.out.printf(emp[i].name + "\t" + emp[i].post + "\t" + emp[i].phoneNumber + "\t" + emp[i].salary + "\t" + emp[i].age + "\n");
        }
    }

    private static void up(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].age > 45)
                emp[i].salary = emp[i].salary + 5000;
            System.out.printf(emp[i].name + "\t" + emp[i].post + "\t" + emp[i].phoneNumber + "\t" + emp[i].salary + "\t" + emp[i].age + "\n");
        }
    }
}
