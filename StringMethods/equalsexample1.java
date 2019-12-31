package StringMethods;

import java.util.ArrayList;
public class equalsexample1 
{
	public static void main(String[] args) 
	{
		String str="FACENXT";
		ArrayList<String> list =new ArrayList<>();
		list.add("FACE");
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String str1 : list)
		{
			if(str1.equals(str))
				System.out.println("FACENXT is present");
		}
	}
}