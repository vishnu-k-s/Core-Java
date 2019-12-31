package StringMethods;

public class charatexample3 
{
	public static void main(String[] args) 
	{
		String str = "Welcome to FACE portal";
		int c=0;   //initializing count value
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='t')
			{
				c++;
			}		
		}
		System.out.println("freequecny of t is: "+c);  //printing count value
	}
}