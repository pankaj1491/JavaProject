package com.company;
class Person {
    private String eyeColor;
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

class Adult extends Person {
    protected int age;

    public Adult(String name, int age) {
        super(name);
        this.age = age;
    }
}

class Policeman extends Adult {
    protected final String job;

    public Policeman(String name, int age) {
        super(name, age);
        this.job = "policeman";
    }
}

public class test {
    public static void main(String[] a) {
        Policeman p = new Policeman("uh",12);
//        Console my_console = System.console();
//        String my_val = my_console.ReadLine();
//        int i = my_val;
//        System.out.println(i);
    }
}