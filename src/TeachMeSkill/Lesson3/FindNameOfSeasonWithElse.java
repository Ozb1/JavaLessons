package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class FindNameOfSeasonWithElse {
    public void findNameOfSeasonWithElse() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int numberOfMonth = in.nextInt();
        if(numberOfMonth >= 1 && numberOfMonth <= 12)
        {
            if (numberOfMonth == 1)
            {
                System.out.println("January - winter");
            }
            else if( numberOfMonth == 2)
            {
                System.out.println ("February - winter");
            }
            else if( numberOfMonth == 3)
            {
                System.out.println ("March - spring");
            }
            else if( numberOfMonth == 4)
            {
                System.out.println ("April - spring");
            }
            else if( numberOfMonth == 5)
            {
                System.out.println ("May - spring");
            }
            else if( numberOfMonth == 6)
            {
                System.out.println ("June - summer");
            }
            else if( numberOfMonth == 7)
            {
                System.out.println ("July - winter");
            }
            else if( numberOfMonth == 8)
            {
                System.out.println ("August - winter");
            }
            else if( numberOfMonth == 9)
            {
                System.out.println ("September - autumn");
            }
            else if( numberOfMonth == 10)
            {
                System.out.println ("October - autumn");
            }
            else if( numberOfMonth == 11)
            {
                System.out.println ("November - autumn");
            }
            else  {
                System.out.println("December - winter");
            }
        }
        else {
            System.out.println("Wrong value");
        }
    }
}
