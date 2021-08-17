package com.techment.oops;

class Address
{
	private String addressLine;
	private String city;
	
	
	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public void getAddressDetails()
	{
				System.out.println("Address Line "+ addressLine);
				System.out.println("City "+ city);

	}

}


class Customer
{
	private String customerName;
	ResidentialAddress address;
	
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName();
	{
		this.customerName=customerName;
	}
	
	public ResidentialAddress getAddress()
	{
		return address;
	}
	
	public void setAddress(ResidentialAddress address)
	{
		this.address=address;
	}
	
	public Customer(String customerName , ResidentialAddress address)
	{
		super();
		this.customerName=customerName;
		this.address=address;
	}
	public void getCustomerDetails()
	{
		System.out.println("Customer Name is "+ customerName);
		System.out.println("Door number is "+ address.doorNo);
		System.out.println("Street name is "+ address.streetName);

	}
}


class ResidentialAddress
{
	int doorNo;
	String streetName;
	public ResidentialAddress(int doorNo , String streetName)
	{
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
	}
}



public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ResidentialAddress address = new ResidentialAddress(5, "Bangalore");
			Customer customer = new Customer("Nishita", address);
			
			customer.getCustomerDetails();	
			}

}
