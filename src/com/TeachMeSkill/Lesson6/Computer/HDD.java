package com.TeachMeSkill.Lesson6.Computer;

public class HDD {
    String name ="ModelHDD";
    int volume = 500;
    String type = "builtIn";
    public HDD(String name, int volume, String type)
    {
        this.name = name;
        this.volume = volume;
        this.type = type;

    }
    public HDD()
    {

    }
    public void OutputHddParametrs()
    {
        System.out.println(name + " " + volume + " " + type);
    }
}
