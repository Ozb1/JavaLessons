package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class DepositAmountSevenProcPerMonth {
    public void depositAmountSevenProcPerMonth()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter deposit value: ");
        float deposit = in.nextFloat();
        System.out.println("Enter how much month you want to storage deposit: ");
        int month = in.nextInt();
        if(deposit > 0) {
            for (int i = 0; i < month; i++) {
                deposit = deposit + (deposit * 0.07F);
            }
            System.out.println("Your finish deposit value is: " + deposit);
        }
        else
        {
            System.out.println("Sorry you are poor");
        }

    }
}
