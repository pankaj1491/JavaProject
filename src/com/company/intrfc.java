
package com.company;
interface first {
    default public void display() {
        System.out.println("This is the display function of method1");
    }
}

interface second {
    default public void display() {
        System.out.println("This is the display function of method2");
    }
}

public class intrfc implements first, second {
    public static void main(String[] args) {
        intrfc object = new intrfc();
        object.display();
    }

    @Override
    public void display() {

    }
}