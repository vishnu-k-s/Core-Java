package strings;

public class stringexample1 {


	public static void main(String[] args) {
	 String s1,s2;
	 s1=new String("hai");
	 
	 s2=new String("hai");
	 System.out.println(s1);
	 System.out.println(s2);
	 
	 System.out.println(s1==s2);
	 System.out.println(s1.hashCode());
	 System.out.println(s2.hashCode());
	 s2=s1+s2;
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s1.hashCode());
	 System.out.println(s2.hashCode());
	 
	
	}
}
