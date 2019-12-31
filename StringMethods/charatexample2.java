package StringMethods;

public class charatexample2 
{
	public static void main(String[] args)
	{
		String str = "Welcome to FACE portal";      
	    int strLength = str.length();          
	    System.out.println("Character at 0 index is: "+ str.charAt(0));  // Fetching 1st character    	    
	    System.out.println("Character at last index is: "+ str.charAt(strLength-1));  // Fetching last character 
	}
}