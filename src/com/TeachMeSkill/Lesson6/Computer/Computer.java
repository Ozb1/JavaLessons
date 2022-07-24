package com.TeachMeSkill.Lesson6.Computer;

public class Computer {
    String model;
    HDD hDD1 = new HDD();
    RAM rAM1 = new RAM();
    int price;
    public Computer(String model, int price)
    {
        this.model = model;
        this.price = price;
    }
    public Computer(String model, int price, HDD hDD1, RAM rAM1)
    {
        this.model = model;
        this.price = price;
        this.hDD1 = hDD1;
        this.rAM1 = rAM1;
    }
    public void OutputFullInformation()
    {
        System.out.println(model + " " + price + " " + hDD1 + " " + rAM1 + " ");
    }
}
