import java.util.Arrays;

class SearchingArray
{
    public static void main(String[] args) {
        int arr[]={10,50,20,40,30,70,66};
        Arrays.sort(arr);                                               //  Sort then Search
        int index = Arrays.binarySearch(arr,66);
        System.out.println(66 + " present at Index : "+index);
    }
}