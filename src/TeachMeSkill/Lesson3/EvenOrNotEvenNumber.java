package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class EvenOrNotEvenNumber {
    public  void evenOrNotEvenNumber()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = in.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("number not even");
        }
    }
}
