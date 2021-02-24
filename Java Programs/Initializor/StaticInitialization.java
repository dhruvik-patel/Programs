public class StaticInitialization
{
 private static int x;
 static
 {
  System.out.println("Static Initialization : "+x);
  x=6;
 }
 public StaticInitialization()
 {
  System.out.println("Constructor : "+x);
 }
 
 public static void main(String[] args)
 {
  StaticInitialization s=new StaticInitialization();
 }
}