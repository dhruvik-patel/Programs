import java.util.Arrays;
class SortArray
{
    public static void main(String[] args) 
    {
        int arr[]={10,50,20,40,30,70,66};
        Arrays.sort(arr);                               //  Static Method call by calss name
        System.out.println(Arrays.toString(arr));          // Converting To String
    }
}