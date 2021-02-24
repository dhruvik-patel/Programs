public class Box
{
 private int l,b,h;
 public Box()
 { l=10; b=8; h=6; }
 public Box(int L,int B,int H)
 { l=L;  b=B;  h=H;  }
 public void show()
 {
  System.out.println("Length : "+l);
  System.out.println("Breadth : "+b);
  System.out.println("Height : "+h);
 }
 public static void main(String[] args)
 {
  Box b1=new Box();
  b1.show();
  Box b2=new Box(68,66,60);
  b2.show();
 }
}