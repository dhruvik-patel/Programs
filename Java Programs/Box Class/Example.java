class SampleBox
{
  private int length,breadth,height;
  public void setDimension(int l,int b,int h)
  { length=l;	breadth=b;	height=h;}
  public void show()
  { System.out.println("Length="+length);
    System.out.println("Breadth="+breadth);
    System.out.println("Height="+height);
  }
}
public class Example
{
  public static void main(String[] args)
  { 
     SampleBox B1=new SampleBox();
     B1.setDimension(20,10,5);
     B1.show();
     B1=new SampleBox();
     B1.show();
  }
}