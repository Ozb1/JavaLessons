package com.TeachMeSkill.Lesson7.PositionOfEmployeeTask;

import com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Entity.Accountant;
import com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Entity.Director;
import com.TeachMeSkill.Lesson7.PositionOfEmployeeTask.Entity.Worker;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Enter ur position: ");
        System.out.println("1) Worker ");
        System.out.println("2) Accountant");
        System.out.println("3) Director");
        Scanner scanner = new Scanner(System.in);
        Accountant accountant = new Accountant();
        Worker worker = new Worker();
        Director director = new Director();
        int position = scanner.nextInt();
        if(position > 0 && position <= 3)
        {
            switch (position)
            {
                case 1:
                    System.out.println(worker.appoint());
                    break;
                case 2:
                    System.out.println(accountant.appoint());
                    break;
                case 3:
                    System.out.println(director.appoint());
                    break;
            }
        }
        else {
            System.out.println("Wrong value");
        }
    }
}
