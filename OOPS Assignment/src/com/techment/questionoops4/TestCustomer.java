package com.techment.questionoops4;
class Address {
      private String addressLine;
      private String city;
      String getaddressLine()
	  {
		  return addressLine;
	  }
	  public void setaddressLine(String addressLine )
	  {
		  this.addressLine=addressLine;
	  }
	  public String getcity()
	  {
		  return city;
	  }
	  public void setcity(String city)
	  {
		  this.city=city;
	  }
     
 
	 Address(String addressLine,String city)
    {
	     setaddressLine(addressLine);
	     setcity(city);
    }
   public String getAddressDetails()
   {	
  	 String fulladdress;
  	 fulladdress=getaddressLine()+',' +getcity();
  	 return(fulladdress);
  	 
   }
}
class Customer
{
private String customerName;
private Address residentialAddress;
private Address officialAddress;
public String getcustomerName()
{
	  return customerName;
}
public void setcustomerName(String customerName )
{
	  this.customerName=customerName;
}
public Address getresidentialAddress()
{
	  return residentialAddress;
}
public void setresidentialAddress(Address residentialAddress)
{
	  this.residentialAddress=residentialAddress;
}
public Address getofficialAddress() {
	return officialAddress;
}
public void setofficialAddress(Address officialAddress) {
	this.officialAddress = officialAddress;
}


Customer()
{
   setcustomerName(null);
   setresidentialAddress(null);
   setofficialAddress(null);
}
Customer(String customerName,Address residentialAddress,Address officialAddress)
{
   setcustomerName(customerName);
   setresidentialAddress(residentialAddress);
   setofficialAddress(officialAddress);
}
public String getCustomerDetails()
{
	String CustomerDetails;
	CustomerDetails="Customer : "+getcustomerName()+"\n"+"Residential Address : "+residentialAddress.getAddressDetails()
	    +"\n"+"Official Address : "+officialAddress.getAddressDetails();
	    return(CustomerDetails);
	 }
}
class TestCustomer
{
public static void main(String[] args) {
	//String myAddress;
	//String myOffice;
	Address addr = new Address("Motinagar" , "Raipur");	
	Address addr1 = new Address("santoshiNagar" , "Raipur");	
	Customer cust=new Customer();
	cust.setcustomerName("nishi");
	cust.setresidentialAddress(addr);
	cust.setofficialAddress(addr1);
	//myOffice = addr1.getAddressDetails();
	//myAddress = addr.getAddressDetails();
	System.out.println(cust.getCustomerDetails());
}
}