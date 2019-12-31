package StringMethods;

public class comparetoexample1 
{
	public static void main(String[] args) 
	{		
		String s1="hello";  
		String s2="";  
		String s3="me"; 
		System.out.println(s1.compareTo(s2));  //returns length of s1 as +ve value
		System.out.println(s2.compareTo(s3));  //returns length of s3 as -ve value
	}
}