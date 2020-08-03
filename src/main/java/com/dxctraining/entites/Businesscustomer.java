package com.dxctraining.entites;
//import customer.Customer;
public class Businesscustomer extends Customer  {
	
	private String businessAddress;
	

	 public Businesscustomer(String name,Account account,String businessAddress){
		super(name,account);
		this.businessAddress=businessAddress;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;

	}
}