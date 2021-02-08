import java.util.*;
public class RepeatedString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        String s=sc.next();
        long count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        count=n/s.length()*count;
        //long t=n%s.length();
        for(int i=0;i<n%s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
