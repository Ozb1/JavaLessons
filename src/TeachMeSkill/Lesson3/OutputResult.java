package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class OutputResult {
    public static void main(String[] args) {
        ColorRainbow rainbow = new ColorRainbow();
        rainbow.colorRainbow();
        System.out.println("---------------------------------------------------");
        DepositAmountSevenProcPerMonth depositSevenProc = new DepositAmountSevenProcPerMonth();
        depositSevenProc.depositAmountSevenProcPerMonth();
        System.out.println("---------------------------------------------------");
        EvenOrNotEvenNumber evenOrNot = new EvenOrNotEvenNumber();
        evenOrNot.evenOrNotEvenNumber();
        System.out.println("---------------------------------------------------");
        Fibonacci fibonacciNumbers = new Fibonacci();
        fibonacciNumbers.fibonacci();
        System.out.println("---------------------------------------------------");
        FindNameOfSeasonByMonthNumber findNameOfSeason = new FindNameOfSeasonByMonthNumber();
        findNameOfSeason.findNameOfSeasonByMonthNumber();
        System.out.println("---------------------------------------------------");
        FindNameOfSeasonWithElse findSeasonWithElse = new FindNameOfSeasonWithElse();
        findSeasonWithElse.findNameOfSeasonWithElse();
        System.out.println("---------------------------------------------------");
        FormSevenToNinetyEight fromSevenNumber = new FormSevenToNinetyEight();
        fromSevenNumber.formSevenToNinetyEight();
        System.out.println("---------------------------------------------------");
        FromFiveToOne numberFiveToOne = new FromFiveToOne();
        numberFiveToOne.fromFiveToOne();
        System.out.println("---------------------------------------------------");
        FromOneToNinetyNine numberNinetyNine = new FromOneToNinetyNine();
        numberNinetyNine.fromOneToNinetyNine();
        System.out.println("---------------------------------------------------");
        MultiplicationTable multiplicationNumber = new MultiplicationTable();
        multiplicationNumber.multiplicationTable();
        System.out.println("---------------------------------------------------");
        PowFromTenToTwenty powNumbers = new PowFromTenToTwenty();
        powNumbers.powFromTenToTwenty();
        System.out.println("---------------------------------------------------");
        StreetTemperature temperature = new StreetTemperature();
        temperature.streetTemperature();
        System.out.println("---------------------------------------------------");
        SummNumberFromUser summNumber = new SummNumberFromUser();
        summNumber.summNumberFromUser();
        System.out.println("---------------------------------------------------");
        TenNumbersToDegree degreeNumber = new TenNumbersToDegree();
        degreeNumber.tenNumbersToDegree();
    }
}


