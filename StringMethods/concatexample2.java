package StringMethods;

public class concatexample2 
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="Face@2.0";
		String s3="Reader";
		String s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
		System.out.println(s4);
		String s5=s1.concat("!!!");
		System.out.println(s5);
		String s6=s1.concat("@").concat(s2);
		System.out.println(s6);
	}
}