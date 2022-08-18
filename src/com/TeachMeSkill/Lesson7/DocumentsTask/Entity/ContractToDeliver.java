package com.TeachMeSkill.Lesson7.DocumentsTask.Entity;

import com.TeachMeSkill.Lesson7.DocumentsTask.Service.Documents;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ContractToDeliver extends Documents {
    public String typeOfGoods;
    public int valueOfGoods;

    public ContractToDeliver(int numberOfDocument, LocalDate dateOfDocument, String typeOfGoods,
                             int valueOfGoods) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = dateOfDocument;
        this.typeOfGoods = typeOfGoods;
        this.valueOfGoods = valueOfGoods;
    }

    public ContractToDeliver() {
    }
    @Override
    public String toString()
    {
        return "Number of document: " + numberOfDocument + " Date of Document: " + dateOfDocument + " Type of Goods: " +
                 typeOfGoods + " Value of Goods " + valueOfGoods;
    }
}
