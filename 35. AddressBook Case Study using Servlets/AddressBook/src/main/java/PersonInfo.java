
public class PersonInfo {
	String name;
	String address;
	String phoneNo;
	
	public PersonInfo(String name, String address, String phoneNo)
	{
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public String toString()
	{
		return "Name: " + name + ", Address: " + address + ", Phone No. " + phoneNo; 
	}
}
