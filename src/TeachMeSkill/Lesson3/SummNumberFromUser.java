package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class SummNumberFromUser {
    public void summNumberFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int userNumber = in.nextInt();

        int summ = 0;
        for(int i = 1; i < userNumber; i++)
        {
            summ += + i;
        }
        System.out.println("Summ of numbers is: " + summ);

    }
}
