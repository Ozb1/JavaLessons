package com.TeachMeSkill.Lesson11;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        try {
            ExistSymbols.printResultforSymbols(value);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
        try {
            ExistSymbols.printResultExistNumbers(value);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
        try{
            ExistSymbols.printReesultExistNumbersAndSymbols(value);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }

        System.out.println("Program end.");
    }
}

