package strings;

public class stringexample2 {
	public static void main(String[] args) {
	
		
		String a="well";
		String ab="all is "+a;
		String abc="all is well";
		String abcd="all is";
		
		System.out.println(abc.hashCode());
		System.out.println(ab.hashCode());
		System.out.println(abc==ab.intern());
		System.out.println(abcd.hashCode());
		
		
		
		
	}
}
