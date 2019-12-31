package StringMethods;

public class containsexample1 
{
	public static void main(String[] args) 
	{
		String str="Hello F#A#C#E@2.0 reader";
		boolean isContains =str.contains("F#A#C#E");
		System.out.println( isContains);
		System.out.println(str.contains("FACe"));    //case sensitive
	}
}