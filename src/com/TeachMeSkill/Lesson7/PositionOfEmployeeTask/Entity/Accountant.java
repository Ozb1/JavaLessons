package com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Entity;

import com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Service.Appointment;

public class Accountant implements Appointment {
    String appoint = "accountant";
    public Accountant()
    {
        this.appoint = appoint;
    }
    @Override
    public String appoint()
    {
        return appoint;
    }
}
