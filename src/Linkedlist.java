import java.util.*;
public class Linkedlist
{
    public static void main(String[] arg)
    {
        LinkedList<Integer> list=new LinkedList();
        for(int i=0;i<10;i++)
        {
            list.add(i+1);
        }

        //printing the list element
        for(int i:list)
        {
            System.out.println(i);
        }

        //adding the element at first
        list.addFirst(22);

        //add elements at any specific position
        list.add(4,44);

        //adding element at last
        list.addLast(56);

        //remove element at specific position
        list.remove(7);

        //printing the new list
        for(int i:list)
        {
            System.out.println(i);
        }
    }
}
