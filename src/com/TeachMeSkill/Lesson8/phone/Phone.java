package com.TeachMeSkill.Lesson8.phone;

import java.util.Scanner;

public class Phone {
    private int number;
    private String model;
    private int weight;
    public Phone(int number, String model, int weight)
    {
        this.model = model;
        this.number = number;
        weight = weight;
    }
    public Phone(int number, String model)
    {
        this.number = number;
        this.model = model;
    }
    public Phone()
    {

    }
    void receiveCall(String name)
    {
         System.out.println("Call " + name);
    }
    void receiveCall(String name, int number)
    {
        System.out.println("Call " + name + " With number " + number);
        System.out.println("My number is: " + this.number);
    }
    @Override
    public String toString()
    {
        return "Number of phone: " + number + " Weight of phone: " + weight + " Model of phone: " +
                model;
    }
    public void getNumber()
    {
        System.out.println(number);
    }
    public void sendMessage(int number1, int number2)
    {
        System.out.println(number1 + "\n" + number2);
    }
}
