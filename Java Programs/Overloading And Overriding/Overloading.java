class A
{
    public void fun(int a)
    {
     System.out.println("Class A");
    }    
}

class B extends A
{
    public void fun(int x,int y)
    {
     System.out.println("Class B");
    } 
}

public class Overloading
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.fun(1);
        obj.fun(66,68);
    }
}
