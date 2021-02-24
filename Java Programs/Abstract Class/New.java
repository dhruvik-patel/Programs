abstract class A
{
    int x;
    public void get(int a)
    {
        x=a;
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("x = "+x);
    }
}

public class New
{
    public static void main(String[] args)
    {
        B o1=new B();
        o1.get(66);
        o1.show();
    }
}
