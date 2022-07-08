package TeachMeSkill.Lesson3;

public class FromOneToNinetyNine {
    public void fromOneToNinetyNine() {
        for(int i = 1; i < 100; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(" " + i + " ");
            }
        }
    }
}
