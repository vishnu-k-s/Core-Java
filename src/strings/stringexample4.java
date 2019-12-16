package strings;

import java.util.StringTokenizer;
public class stringexample4 {

	public static void main(String[] args) {
		String str="i , am , going , to , split , this ,  by , space";
		StringTokenizer st = new StringTokenizer(str);  
		System.out.println("split by space");
		 while (st.hasMoreTokens()) 
		 {  
	         System.out.print(st.nextToken());  
	     }  
		 System.out.println();
		 System.out.println("split by ,");
		 StringTokenizer st2 = new StringTokenizer(str,",");  
		 while (st2.hasMoreTokens()) 
		 {  
	         System.out.print(st2.nextToken());  
	     } 
		 
		

	}

}
