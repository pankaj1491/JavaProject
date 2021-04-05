
package com.company;

class Shape {
    public Shape() {
        System.out.println("inside Shape class default constructor");
    }
}

class rectangle extends Shape {
    public rectangle() {
        System.out.println("inside Rectangle class default constructor");
    }
}

class square extends rectangle {
    public square() {
        System.out.println("inside Square class default constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        square sq = new square();
    }
}