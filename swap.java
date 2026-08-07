import java.util.*;

public class swap
{
    public static void main(String[] args)
    {
      int arr[] = {1,3,4,5,7};
      int st=0,end=arr.length-1;
      while(st<end){
          int temp=arr[st];
          arr[st]=arr[end];
          arr[end]=temp;
          st++;
          end--;
      }
        System.out.println(Arrays.toString(arr));
    }
}
