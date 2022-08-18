package com.TeachMeSkill.Lesson7.DocumentsTask.Entity;

import com.TeachMeSkill.Lesson7.DocumentsTask.Service.Documents;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FinanceDocument extends Documents {
    public int totalSumPerMonth;
    public int departmentCode;
    public FinanceDocument(int numberOfDocument, LocalDate dateOfDocument, int totalSumPerMonth,
                           int departmentCode)
    {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = dateOfDocument;
        this.totalSumPerMonth = totalSumPerMonth;
        this.departmentCode = departmentCode;
    }
    public FinanceDocument()
    {

    }
    @Override
    public String toString()
    {
        return "Number of document: " + numberOfDocument + " Date of Document: " + dateOfDocument + " Type of Goods: " +
                totalSumPerMonth + " Value of Goods " + departmentCode;
    }
}
