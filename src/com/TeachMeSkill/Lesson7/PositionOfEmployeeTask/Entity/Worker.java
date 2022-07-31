package com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Entity;

import com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Service.Appointment;

public class Worker implements Appointment {
    public String worker = "Worker";
    public Worker()
    {
        this.worker = worker;
    }
    public String appoint()
    {
        return worker;
    }
}
