package TeachMeSkill.Lesson3;

import java.util.Scanner;

public class StreetTemperature {
    public void streetTemperature() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temperature = in.nextInt();
        if(temperature > -5)
        {
            System.out.println("Hot");
        }
        else if (temperature <= -5 && temperature > -20)
        {
            System.out.println("Normal");
        }
        else
        {
            System.out.println("Cold");
        }
    }
}
