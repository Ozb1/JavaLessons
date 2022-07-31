package com.TeachMeSkill.Lesson7.DocumentsTask.Entity;

import com.TeachMeSkill.Lesson7.DocumentsTask.Service.Documents;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ContractWithEmployee extends Documents {
    public int dateOfTheEndContract;
    public String nameOfEmployee;
    public ContractWithEmployee(int numberOfDocument, LocalDate dateOfDocument, int dateOfTheEndContract,
                                String nameOfEmployee)
    {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = dateOfDocument;
        this.dateOfTheEndContract = dateOfTheEndContract;
        this.nameOfEmployee = nameOfEmployee;
    }
    public ContractWithEmployee()
    {

    }
    @Override
    public String toString()
    {
        return "Number of document: " + numberOfDocument + " Date of Document: " + dateOfDocument + " Type of Goods: " +
                dateOfTheEndContract + " Value of Goods " + nameOfEmployee;
    }
}
