package com.dxctraining.entites;

public class Regularcustomer extends Customer {
	private String houseAddress;
	
	
	 public Regularcustomer(String name,Account account,String houseAddress){
		super(name,account);
		this.houseAddress=houseAddress;
	 }
	 
	public String getHouseAddress(){
		return houseAddress;	}
	
	void setHouseAddress(String houseAddress){
		this.houseAddress=houseAddress;

	}

}
