package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


import java.util.*;
class Display {
    public Display(int i) {
        System.out.println("ONE");
    }

    public Display() {
        this(1);

        System.out.println("TWO");
    }

    void Display() {
        Display(1);

        System.out.println("THREE");
    }

    void Display(int i) {
        System.out.println("FOUR");
    }
}

public class Main {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.Display();
    }
}

abstract class Homeloan {
    double amount;
    int time;
    public abstract double getRateOfInterest();
    public abstract double simpleInterest();
}

class Bank1 extends Homeloan {


    public Bank1(double amount, int time) {
        this.amount=amount;
        this.time=time;
    }

    public double getRateOfInterest(){
        return 7.2;
    }

    public double simpleInterest() {

        return (((this.amount*this.time*getRateOfInterest())/100)+(amount));
    }

}

class Bank2 extends Homeloan {
    public  Bank2(double amount, int time) {
        this.amount=amount;
        this.time=time;
    }

    public double getRateOfInterest(){
        return 8.1;
    }

    public double simpleInterest() {

        return (((amount*time*getRateOfInterest())/100)+(amount));
    }

}

class Main1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        System.out.println(obj1.amount);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }




}



