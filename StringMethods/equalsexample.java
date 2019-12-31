package StringMethods;

public class equalsexample 
{
	public static void main(String[] args) 
	{		
		String s1="facenow";
		String s2="facenow";
		String s3="FACENOW";
		String s4="facenxt";
		System.out.println(s1.equals(s2));    //true content are equal
		System.out.println(s1.equals(s3));    //false case are not  equal
		System.out.println(s1.equals(s4));    //false content are not  equal
	}
}