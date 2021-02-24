class A
{
    public void fun(int a)
    {
     System.out.println("Class A");
    }    
}

class B extends A
{
    public void fun(int a)
    {
     System.out.println("Class B");
    } 
}

public class Overriding
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.fun(68);
        obj.fun(66);
    }
}
