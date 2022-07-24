package com.TeachMeSkill.Lesson6.CreditCard;
import java.util.Scanner;
public class CreditCard {
    Scanner scanner = new Scanner(System.in);
    int numberCount;
    double summCount;
    public CreditCard(int numberCount, double summCount)
    {
        this.numberCount = numberCount;
        this.summCount = summCount;
    }
    public void AddSummIntoCard()
    {
        System.out.println("Enter how much money u want to add:");
        double addValue = scanner.nextDouble();
        if(addValue > 0)
        {
            summCount = summCount + addValue;
        }
        else {
            System.out.println("Wrong value");
        }
    }
    public void WithdrawSummFromCard()
    {
        System.out.println("Enter how much money u want to withdraw: ");
        double withdrawValue = scanner.nextDouble();
        if (summCount > withdrawValue && withdrawValue > 0)
        {
            summCount = summCount - withdrawValue;
        }
        else {
            System.out.println("Ur entered value is wrong");
        }
    }
    public void InformationCount(){
        System.out.println("In ur count number " + numberCount + " is: " + summCount + " USD");
    }
}
