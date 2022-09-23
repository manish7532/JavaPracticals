package relationship;

public class Address {
	
	int pincode;
	String addrline,street,city,state;
	
	public Address() 
	{
		addrline="a/p Pune";
		street="Mg Road";
		city="Pune";
		state="Maharashtra";
		pincode=411035;
		
	}
	
	public Address(String addrline,String street,String city,String state,int pincode)
	{
		this.addrline=addrline;
		this.street=street;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
	}
	
	public void display()
	{
		System.out.println("Address Line : "+addrline);
		System.out.println("Street : "+street);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
		System.out.println("Pincode :"+pincode);
	}

}