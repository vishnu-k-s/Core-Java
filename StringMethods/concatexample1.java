package StringMethods;

public class concatexample1
{
	public static void main(String[] args) 
	{
		String s1=" Hello ";
		String s2=" Face@2.0 ";
		String s3=" Reader ";
		String s4=s1.concat(s2);    //s1 concatinated with s2 & stored in s4
		System.out.println(s4);     //printing s4
		String s5=s1.concat(s2).concat(s3);    //s1 concatinated with s2&s3 and stored in s5
		System.out.println(s5);      //printing s5
	}
}