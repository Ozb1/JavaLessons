package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class MultiplicationTable {
    public void multiplicationTable()
    {
        for(int i = 1; i <= 9; i++)
        {
            System.out.print("Number: " + i + " is ");
            for(int j = 1; j <= 9; j++) {
                System.out.print(" " + j * i + " ");
            }
            System.out.println();
        }
    }
}
