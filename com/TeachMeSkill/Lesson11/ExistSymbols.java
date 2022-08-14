package com.TeachMeSkill.Lesson11;

import java.util.Locale;

public class ExistSymbols {
    public static void printResultforSymbols(String numberDocument) throws ExeptionExistSymbols
    {
        if(numberDocument.toLowerCase(Locale.ROOT).contains("abc")){
            System.out.println("Symbols abc exists in Document");
        }
        else {
            throw new ExeptionExistSymbols("Symbols is didn't exist", numberDocument);
        }
    }
    public static void printResultExistNumbers(String numberDocument) throws ExeptionExistNumbers
    {
        if(numberDocument.startsWith("555"))
        {
            System.out.println("Document starts with numbers 555");
        }
        else{
            throw new ExeptionExistNumbers("Document didnt start with 555", numberDocument);
        }
    }
    public static void printReesultExistNumbersAndSymbols(String numberDocument) throws ExeptionExistNumbersAndSymbols
    {
        if(numberDocument.toLowerCase(Locale.ROOT).endsWith("1a2b")){
            System.out.println("Document ends with 1a2b");
        }
        else{
            throw new ExeptionExistNumbersAndSymbols("Document didn't ends with 1a2b", numberDocument);
        }
    }
}
