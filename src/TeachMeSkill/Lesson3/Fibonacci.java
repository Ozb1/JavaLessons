package TeachMeSkill.Lesson3;

public class Fibonacci {
    public  void fibonacci() {
        int number0 = 1;
        int number1 = 1;
        int number2;
        System.out.print(number0 + " " + number1 + " ");
        for(int i = 3; i <= 11; i++)
        {
            number2 = number0 + number1;
            System.out.print(" " + number2 + " ");
            number0 = number1;
            number1 = number2;
        }

    }
}
