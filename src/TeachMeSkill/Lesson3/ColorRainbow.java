package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class ColorRainbow {
    public void colorRainbow()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter color number of rainbow: ");
        int numberColorRainbow = in.nextInt();
        if(numberColorRainbow >= 1 && numberColorRainbow <= 7)
        {
            switch (numberColorRainbow) {
                case 1 -> System.out.println("Red");
                case 2 -> System.out.println("Orange");
                case 3 -> System.out.println("Yellow");
                case 4 -> System.out.println("Green");
                case 5 -> System.out.println("Cyan");
                case 6 -> System.out.println("Blue");
                case 7 -> System.out.println("Violet");
            }
        }
        else
        {
            System.out.println("Wrong value");
        }
    }
}
