class A implements Runnable
{
    public void run()
    {
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println("Thread A : "+i);
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println("Thread B : "+i);
        }
    }
}
class C implements Runnable
{
    public void run()
    {
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println("Thread C : "+i);
        }
    }
}
public class Nice
{
    public static void main(String []args)
    {
        Thread t1=new Thread(new A());
        Thread t2=new Thread(new B());
	Thread t3=new Thread(new C());
        t1.start();
	t3.start();
        t2.start();
    }
}
