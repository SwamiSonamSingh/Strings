import java.util.*;
public class CuttingStickH
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       int temp=0;
       while(temp<arr.length)
       {
           System.out.println(arr.length-temp);
           int min =1001;
           for (int i = 0; i < arr.length; i++) {
               if (arr[i]>0 && min > arr[i])
               {
                   min = arr[i];
               }
           }
           for(int i=0;i<arr.length;i++)
           {
               arr[i]=arr[i]-min;
               if(arr[i]==0)
               {
                   temp++;
               }
           }
       }
    }
}
