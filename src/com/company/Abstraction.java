package com.company;

class Abstraction {
    public static void main(String[] args) {

        // Create an object named 's1' and complete the code to print the desired output
        Student1 s1 = new Student1(1056,"karan",8.8);
        s1.displayProfile();
        System.out.println(s1.findPercentage());
    }
}

class Student1 {
    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor of 'Student' class here
    public Student1(){}
    public Student1(int rollno,String name, double cgpa){
        this.rollno=rollno;
        this.name=name;
        this.cgpa=cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);

    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}