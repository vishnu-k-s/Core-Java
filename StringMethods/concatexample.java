package StringMethods;

public class concatexample 
{
	public static void main(String[] args) 
	{
		String s1="java string";
		s1.concat("is immutable");
		System.out.println(s1);    //original s1 will be printed without concatination
		s1=s1.concat(" is immutable so assign it explicitly");
		System.out.println(s1);    //s1 will be printed with concatination	
	}
}