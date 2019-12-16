package Encapsulation;

public class encap 
{
	private String name;
	private String address;
	private Long contactno;
	private String emailid;
	
	//FOR SETTING VALUES
	void setname(String name)
	{
	     this.name=name;
	}
	void setaddress(String address)
	{
	     this.address=address;
	}
	void setcontactno(Long contactno)
	{
	     this.contactno=contactno;
	}
	void setemailid(String emailid)
	{
	     this.emailid=emailid;
	}
	
	//FOR GETTING VALUES
	String getname()
	{
	     return name;
	}
	String getaddress()
	{
	     return address;
	}
	Long getcontactno()
	{
	     return contactno;
	}
	String getemailid()
	{
	     return emailid;
	}
}