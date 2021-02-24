import java.util.*;
class Die
{
    int sideUp;
    int getSideUp()
    {
        return sideUp;
    }
    void roll()
    {
        Random r=new Random();
        sideUp = r.nextInt(6) + 1;
    }
    void display(Die d)
    {
        sideUp = sideUp + d.sideUp;
        System.out.println(sideUp);
    }
}

public class DieDemo
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        d1.roll();
        d2.roll();
        d1.display(d2);
    }
}