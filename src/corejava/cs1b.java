package corejava;

import java.util.Scanner;



public class cs1b {
	String  na;
	String add;
	String con;
	String email;
	
	public cs1b(String name, String address, String contactNumber, String email)
	{
		this.na=name;
        this.add=address;
        this.con=contactNumber;
        this.email=email;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("REGISTRATION");
		System.out.print("Enter your name: ");
	    String name=s.nextLine();
		System.out.print("Enter your address: ");
		String address=s.nextLine();
		System.out.print("Contact Number: ");
		String contactNumber=s.nextLine();
		System.out.print("E-Mail ID: ");
		String email=s.nextLine();
		
		cs1b obj=new cs1b(name,address,contactNumber,email);	
		b obj2=new b();
		
		System.out.println("\n\nYOUR DETAILS ARE\n");
		System.out.println("NAME:     "+obj.na);
		System.out.println("ADDRESS:  "+obj.add);
		System.out.println("NUMBER:   "+obj.con);
		System.out.println("E-MAIL:   "+obj.email);					
	}
}