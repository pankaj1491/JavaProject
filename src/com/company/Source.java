//Please do not change the class names provided, and edit only the indicated sections.
package com.company;
import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }


    protected abstract double getArea();

    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
}

// Implement the Parallelogram class
class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(double side1, double side2, double height) {
      super(side1,side2,side1,side2);
        this.height=height;
    }

    public double getArea(){
            return(side1*height);
    }
}

// Implement the Rhombus class
class Rhombus extends Parallelogram {
    public Rhombus(double side, double height) {
         super(side,side,height);
    }
}

// Implement the Rectangle class
class Rectangle {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
    this.length=length;
    this.breadth=breadth;
    }
    public double getArea(){
        return(length*breadth);
    }

    protected double getPerimeter() {
        return (2*(length+breadth));
    }
}

// Implement the Square class
class Square extends Rectangle{
    public Square(double side) {
       super(side,side);
    }
}

// Do not edit the Test class
class Source {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogram parallelogram = new Parallelogram(side1, side2, height);
        System.out.println("Parallelogram Perimeter: " + parallelogram.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogram.getArea());

        //Rhombus
        double side = scan.nextDouble();
        height = scan.nextDouble();
        Rhombus rhombus = new Rhombus(side, height);
        System.out.println("Rhombus Perimeter: " + rhombus.getPerimeter());
        System.out.println("Rhombus Area: " + rhombus.getArea());

        //Rectangle
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        //Square
        side = scan.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Square Area: " + square.getArea());

        scan.close();
    }
}