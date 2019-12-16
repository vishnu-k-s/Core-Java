package corejava;

import java.util.Scanner;

public class cs1reg {
    	
	public static String name;
	static String address;
	static String contactNumber;
	static String email;
	public static void main(String[] args)	
	{
		cs1reg obj=new cs1reg();
		b obj1=new b();
		Scanner s=new Scanner(System.in);
		System.out.println("REGISTRATION");
		System.out.print("Enter your name: ");
	    name=s.nextLine();
		System.out.print("Enter your address: ");
		address=s.nextLine();
		System.out.print("Contact Number: ");
		contactNumber=s.nextLine();
		System.out.print("E-Mail ID: ");
		email=s.nextLine();
		//System.out.println("NAME:     "+obj.name);
		obj1.show();
		
	}	
}

 class b{
	public void show()
	{
		
		System.out.println("\n\nYOUR DETAILS ARE\n");
		System.out.println("NAME:     "+cs1reg.name);
		System.out.println("ADDRESS:  "+cs1reg.address);
		System.out.println("NUMBER:   "+cs1reg.contactNumber);
		System.out.println("E-MAIL:   "+cs1reg.email);
			
	}
}