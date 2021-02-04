import java.util.*;
public class Stackimp
{
    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<>();

        //inserting the elements
        stack.push(22);
        stack.push(12);
        stack.push(34);
        stack.push(78);
        stack.push(90);

        //pop all the elements
        for(int i=0;i<5;i++)
        {
            System.out.println(stack.pop());
        }
    }
}
