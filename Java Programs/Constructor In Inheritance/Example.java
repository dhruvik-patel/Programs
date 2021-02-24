class A
{
    public A(int x)
    {
            System.out.println("A");
    }

}

class B extends A
{
    public B()
    {
        super(6);
        System.out.println("B");
    }
}

public class Example
{
    public static void main(String[] args)
    {
        B obj=new B();
    }
}
