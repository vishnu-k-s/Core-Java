package strings;
 import java.lang.*;
public class stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i,am ,going,to split";
		String str1 []=str.split(",");
		char str2 []=str.toCharArray();
		for(char a:str2)
			System.out.println(a);

	}

}
