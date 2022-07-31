package com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Entity;

import com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Service.Appointment;

public class Director implements Appointment {
    public String director = "Director";
    public Director()
    {
        this.director = director;
    }
    public String appoint()
    {
        return director;
    }
}
