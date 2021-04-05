package com.company;

class Coffee
{
    protected void order()
    {
        System.out.println("Coffee");
    }
}

public class Super extends Coffee
{
    public static void main(String args[])
    {
        Super c = new Super();
        c.order();
    }
}