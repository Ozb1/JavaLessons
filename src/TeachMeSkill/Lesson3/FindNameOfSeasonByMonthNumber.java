package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class FindNameOfSeasonByMonthNumber {
    public void findNameOfSeasonByMonthNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int numberOfMonth = in.nextInt();

        if(numberOfMonth >= 1 && numberOfMonth <= 12)
        {
            switch (numberOfMonth) {
                case 1 -> System.out.println("January - winter");
                case 2 -> System.out.println("February - winter");
                case 3 -> System.out.println("March - spring");
                case 4 -> System.out.println("April - spring");
                case 5 -> System.out.println("May - spring");
                case 6 -> System.out.println("June - summer");
                case 7 -> System.out.println("July - winter");
                case 8 -> System.out.println("August - winter");
                case 9 -> System.out.println("September - autumn");
                case 10 -> System.out.println("October - autumn");
                case 11 -> System.out.println("November - autumn");
                case 12 -> System.out.println("December - winter");
            }
        }
        else
        {
            System.out.println("Wrong value of month");
        }
    }


}
