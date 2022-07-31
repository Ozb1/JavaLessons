package com.TeachMeSkill.Lesson7.DocumentsTask;

import com.TeachMeSkill.Lesson7.DocumentsTask.Entity.ContractToDeliver;
import com.TeachMeSkill.Lesson7.DocumentsTask.Entity.ContractWithEmployee;
import com.TeachMeSkill.Lesson7.DocumentsTask.Entity.FinanceDocument;
import com.TeachMeSkill.Lesson7.DocumentsTask.Service.Documents;
import com.TeachMeSkill.Lesson7.DocumentsTask.Service.Register;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {
        LocalDate dateOfDocument = LocalDate.of(2007,5,15);
        ContractToDeliver contractToDeliver = new ContractToDeliver(23,dateOfDocument,"Medicine",5);
        ContractWithEmployee contractWithEmployee = new ContractWithEmployee(25,dateOfDocument,2005,"Viktor");
        FinanceDocument financeDocument = new FinanceDocument(33,dateOfDocument,5000,2015);
        Documents[] documents = {contractToDeliver, contractWithEmployee, financeDocument};
        Register register = new Register();
        for (Documents document : documents) {
            register.saveRegisterInfo(document);
        }
        register.showRegisterInfo(documents);
    }
}
 