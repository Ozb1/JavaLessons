package com.TeachMeSkill.Lesson14;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Enter ur date: ");
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(inputDate);
            DateFormat formatter2 = new SimpleDateFormat("EEEE", Locale.ENGLISH);
            formatter2.setLenient(false);
            String dayOfTheWeek = formatter2.format(date);
            System.out.println(dayOfTheWeek);
        }
        catch(DateTimeException | ParseException ex)
        {
            ex.printStackTrace();
        }
    }
}
