public class Stringimp 
{
	public static void main(String[] ar)
	{
		
		//String:-String is mutable that means it cannot be changed
		//the immutable string is StringBuilder
		//defining string
		String s="Hello Sachin";
		String t=" Sharma";
		String u=" Sharma";
		
		//find the character at the given position
		char c=s.charAt(4);
		System.out.println(c);
		
		//convert all strings in upper case by directly
		System.out.println(s.toUpperCase());
		
		//converting string in upper case by using object
		String s1=s.toUpperCase();		
		System.out.println(s1);
		
		//converting all string elements in lower case by using object
		String s2=s.toLowerCase();
		System.out.println(s2);
		
		//merge the two strings by using object
		String s3=s.concat(t);
		System.out.println(s3);
		
		//defining string
		String x="Apple";
		String y="Apple";
		String z="Ant";
		String k="Bus";
		
		//string comparison int the order of dictionary words
		//here  x & y both are apple so it return zero
		int cmp=x.compareTo(y);
		System.out.println(cmp);
		
		//here comparison between ant and apple here result is -2
		//because of the comparison between n & p
		int cmp1=z.compareTo(x);
		System.out.println(cmp1);
		
		//comparision between bus and apple & the result is 1
		int cmp2=k.compareTo(x);
		System.out.println(cmp2);
		
		//in the any string it check the occurance of the specific
		//character of we can say that string
		System.out.println(s.contains("chi"));
		
		//compare the two string if it euqual the return true
		//otherwise false
		//its return type is boolean
		System.out.println(t.equalsIgnoreCase(u));
		System.out.println(s.equalsIgnoreCase(t));
		
		//print the substring to given range but in the upper limit
		//in the place of 4 it takes (upperlimit-1) that means from
		//index 1 to 3 it also contain spaces
		System.out.println(s.substring(1,4));
		
		//defining string
		String p=("        Nazir       ");
		
		//the trim method use to remove all the blank spaces only 
		//when the void spaces present in starting or ending of the string
		System.out.println(p.trim());
		String p1=("              Sachin Sharma         ");
		System.out.println(p1.trim());
		
		//it return the sequence of bytes
		byte arr[]=s.getBytes();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String pr="Welcome to world of binary magics";
		
		//return the index of substring
		System.out.println(pr.indexOf("to"));
		System.out.println(pr.indexOf("binary"));
		
		//it check whether the is null or not & its return
		//type id boolean
		System.out.println(s.isEmpty());
		
		//replace the elements which are H to h
		//replace all is same work as replace
		System.out.println(s.replace("H","h"));
		
	}
}
