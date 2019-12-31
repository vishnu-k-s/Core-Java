package StringMethods;

public class endswithexample1 
{
	public static void main(String[] args) 
	{
		String str="welcome to FACE.in";
		System.out.println(str.endsWith("in"));
		if(str.endsWith("com"))
			System.out.println("string ends with com");
		else
			System.out.println("string not ends with com");
	}
}