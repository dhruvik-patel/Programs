class A
{
    A()
    {
        System.out.println("A 1");
    }
}

class B extends A
{
    B()
    {
        this(66);                                //  this()  ->  therefore either we or compiler can't write super();
        System.out.println("B 1");
    }
    B(int x)
    {                                           // super();   by default  control goes to parent class
        System.out.println("B 2");
    }
}

public class Example
{
    public static void main(String[] args)
    {
	B o1= new B();
    }
}
