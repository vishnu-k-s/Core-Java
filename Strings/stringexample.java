package Strings;
 
import java.lang.*;
public class stringexample 
{
	public static void main(String[] args) 
	{
		String str="i,am ,going,to split";
		String str1 []=str.split(",");     //spliting str w.r.t ","
		char str2 []=str.toCharArray();    //converting str to char array
		for(char a:str2)
			System.out.println(a);
	}
}