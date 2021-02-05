import java.sql.SQLOutput;
import java.util.*;
public class PrefixSum
{
    public static void main(String[] ar)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no. of element:");
      int n=sc.nextInt();
      int []arr=new int[n];
      System.out.println("Enter the array element:");
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      int prefix[]=new int[n];
      prefix[0]=arr[0];
      for(int i=1;i<n;i++)
      {
          prefix[i]=prefix[i-1]+arr[i];
      }
      System.out.println("Enter the range:");
      int left=sc.nextInt();
      int right=sc.nextInt();
      int result=prefix[right]-prefix[left-1];
      System.out.println("Prefix sum from "+left+" to "+right+" is:"+result);
    }
}
