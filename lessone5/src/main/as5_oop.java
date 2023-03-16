package main;

import model.Car;
import model.Human;

public class as5_oop {
    public static void main(String[] args) {
     Human human1 = new Human();
     human1.firstName = "Aram";
     human1.lastName = "Aramyan";
     human1.gender = 'm';
     human1.isArmenian = true;
     human1.year = 2000;
        Human human2 = new Human();
        human2.firstName = "Anna";
        human2.lastName = "Grigoryan";
        human2.gender = 'f';
        human2.isArmenian = true;
        human2.year = 2004;
        System.out.println(human1.firstName + " " + human1.lastName);
        if ( human1.year < human2.year )
            System.out.println(human1.firstName);
        else
            System.out.println(human2.firstName);
        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName);
        // if-i tesak System.out.print(payman ? paymani bavararum : else)
        Car car1 = new Car();
        car1.setYear(2020);
        System.out.println(car1.getYear());

        Human h = new Human();
        h.firstName = "Ani";
        System.out.println(h.firstName);
        h.sayHello();
        human1.printFullName();
        human2.printFullName();
        h.printFullName();
        human1.fullName();
        String s = human1.fullName();
        System.out.println("Full name of human1 is " + s);
        h.sum(8,9);
        human1.printFullName();
        human1.sum(4,4);
        human1.print1ton(13);
        Car car = new Car();
        car.setEngin(-1.9);
        System.out.println(car.getEngin());
        car.setEngin(1.6);
        System.out.println(car.getEngin());
        Car car4 = new Car();
        car4.setModel("Bmw");
        car4.setYear(2020);
        car4.setEngin(6.4);
        System.out.println(car4.getModel() + "," + car4.getEngin() + "," + car4.getYear());

    }
}
