import java.util.HashMap;
public class Test
{
    public static void main(String[] args)
    {
        HashMap<String,String> student=new HashMap<>();

        //inserting the values in hashmap
        student.put("10","Nazir");
        student.put("2","Saket");
        student.put("3","Ravi");
        student.put("4","Ranvijay");
        student.put("5","Rahul");

        //printing the values of hashmap
        System.out.println(student);

        //printing size of hashmap
        System.out.println(student.size());

        //get the value which are associated with key
        System.out.println(student.get("10"));

        //removing the values that are associated with key
        System.out.println(student.remove("2"));

        //hash map after removing value
        System.out.println(student);

        //displaying the keys
        System.out.println("Keys are:");
        for(String i:student.keySet())
        {
           System.out.println(i);
        }

        //displaying values in hashmap
        System.out.println("Values are:");
        for(String i:student.values())
        {
            System.out.println(i);
        }

        //displaying key and values according to the mapping
        for(String i:student.keySet())
        {
            System.out.println("Key:"+i+" Associated with:"+student.get(i)+" value");
        }

        //clear all values of hashmap
        student.clear();
        System.out.println(student);
    }
}
