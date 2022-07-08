package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class OutputResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Task from 1 to 14: ");
        int numberOfTask = in.nextInt();
        switch (numberOfTask) {
            case 1 -> {
                ColorRainbow rainbow = new ColorRainbow();
                rainbow.colorRainbow();
            }
            case 2 -> {
                DepositAmountSevenProcPerMonth depositSevenProc = new DepositAmountSevenProcPerMonth();
                depositSevenProc.depositAmountSevenProcPerMonth();
            }
            case 3 -> {
                EvenOrNotEvenNumber evenOrNot = new EvenOrNotEvenNumber();
                evenOrNot.evenOrNotEvenNumber();
            }
            case 4 -> {
                Fibonacci fibonacciNumbers = new Fibonacci();
                fibonacciNumbers.fibonacci();
            }
            case 5 -> {
                FindNameOfSeasonByMonthNumber findNameOfSeason = new FindNameOfSeasonByMonthNumber();
                findNameOfSeason.findNameOfSeasonByMonthNumber();
            }
            case 6 -> {
                FindNameOfSeasonWithElse findSeasonWithElse = new FindNameOfSeasonWithElse();
                findSeasonWithElse.findNameOfSeasonWithElse();
            }
            case 7 -> {
                FormSevenToNinetyEight fromSevenNumber = new FormSevenToNinetyEight();
                fromSevenNumber.formSevenToNinetyEight();
            }
            case 8 -> {
                FromFiveToOne numberFiveToOne = new FromFiveToOne();
                numberFiveToOne.fromFiveToOne();
            }
            case 9 -> {
                FromOneToNinetyNine numberNinetyNine = new FromOneToNinetyNine();
                numberNinetyNine.fromOneToNinetyNine();
            }
            case 10 -> {
                MultiplicationTable multiplicationNumber = new MultiplicationTable();
                multiplicationNumber.multiplicationTable();
            }
            case 11 -> {
                PowFromTenToTwenty powNumbers = new PowFromTenToTwenty();
                powNumbers.powFromTenToTwenty();
            }
            case 12 -> {
                StreetTemperature temperature = new StreetTemperature();
                temperature.streetTemperature();
            }
            case 13 -> {
                SummNumberFromUser summNumber = new SummNumberFromUser();
                summNumber.summNumberFromUser();
            }
            case 14 -> {
                TenNumbersToDegree degreeNumber = new TenNumbersToDegree();
                degreeNumber.tenNumbersToDegree();
            }
        }
    }
}


