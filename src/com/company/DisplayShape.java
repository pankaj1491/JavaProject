package com.company;
import java.util.*;

class Shape1{
    public void display() {
        System.out.println("display method overridding");
    }

    public static void print() {
        System.out.println("The shape is a circle");
    }

}
class Triangle extends Shape1{
    public void display() {
        System.out.println("The shape is a triangle");
    }
}
class Rectangle1 extends Shape1{
    public void display() {
        System.out.println("The shape is a rectangle");
    }
}

public class DisplayShape {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape1 obj = new Triangle();
        Shape1 obj1 = new Rectangle1();
        int numberOfSides = in.nextInt();
        switch (numberOfSides) {
            case 0:
                obj.print();
                break;
            case 3:
                obj.display();
                break;
            case 4:
                obj1.display();
                break;
            default:
                System.out.println("Enter a valid number of sides!");
                break;
        }
    }
    }


