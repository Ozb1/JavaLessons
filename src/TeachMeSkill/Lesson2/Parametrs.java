package TeachMeSkill.Lesson2;

public class Parametrs {
        public int weight = 100;
        public double height = 25.6;
        public String type = "Dog";
        public char male = 'F';
        public boolean check = true;

        public void Summ()
        {
            double result = weight + height;
            System.out.println("Weight + height is: " + result);
        }
        public void parametrs()
        {
            System.out.println("type: " + type);
            System.out.println("male is: " + male);
            System.out.println("alive: " + check);
        }
}
