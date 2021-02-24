public class Instance
{
 private int x;
 {
  System.out.println("Instance Initialization : "+x);
  x=6;
 }
 public Instance()
 { System.out.println("Constructor : "+x);}

 public static void main(String[] args)
 {
  Instance i=new Instance();
 }
}
