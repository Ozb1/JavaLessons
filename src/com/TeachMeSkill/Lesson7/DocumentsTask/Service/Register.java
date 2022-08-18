package com.TeachMeSkill.Lesson7.DocumentsTask.Service;

import java.util.ArrayList;

public class Register extends Documents {
    public ArrayList<String> documentsArray = new ArrayList<>(10);
    int count = 0;
    public ArrayList saveRegisterInfo(Documents documents)
    {
        documentsArray.add(String.valueOf(documents));
        return documentsArray;
    }
    public void showRegisterInfo(Documents[] documents)
    {
        for (int i = 0; i < documents.length; i++)
        {
            System.out.println(documents[i]);
        }
    }
}
