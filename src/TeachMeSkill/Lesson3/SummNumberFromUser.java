package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class SummNumberFromUser {
    public void summNumberFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int userNumber = in.nextInt();
        int result = 0;
        for(int i = 1; i < userNumber; i++)
        {
            result += + i;        
        }
        System.out.println(result);
    }
}
