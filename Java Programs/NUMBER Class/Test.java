public class Test
{
    public static void main(String[] args)
    {
        Integer x=5;

        System.out.println("\n METHOD   :   1");
        //  xxxValue() Method  :  convert to xxx premitive type
        System.out.println(x.byteValue());
        System.out.println(x.shortValue());
        System.out.println(x.floatValue());
        System.out.println(x.longValue());
        System.out.println(x.doubleValue());    

        System.out.println("\n METHOD     :  2");
        // compareTo()  : compare same type of Number object

        System.out.println(x.compareTo(3));     // -1 : x > 3
        System.out.println(x.compareTo(5));     // 0  : x == 5
        System.out.println(x.compareTo(8));     // 1  : x < 8

        System.out.println("\n METHOD   : 3");
        //  equals()   :   compare type and value of Number object to arguement
        System.out.println(x.equals(5));
        System.out.println(x.equals(5.0)); 

        System.out.println("\n METHOD  :  4");
        // valueOf()  :   arg : int , String  ,  (String , int)
        Integer a = Integer.valueOf(9);
        Double d = Double.valueOf(5);
        Float f = Float.valueOf("80");
        Integer c = Integer.valueOf("444",16);
        System.out.println(a);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);

        System.out.println("\n Method  :  5");
        //  toString() & toString(int i)   :   returns a string object
        System.out.println(x.toString());               //  String toString()
        System.out.println(Integer.toString(66));       //  static String toString(int i)
    }
}