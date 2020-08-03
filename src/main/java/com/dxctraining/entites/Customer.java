package com.dxctraining.entites;

public class Customer  {
	private int id;
	private String name;
	private Account account;
	

	public Customer(String name){
		
		this.name=name;
	
		
	}
	public Customer(String name,Account account){
		this(name);
		this.account=account;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	/*@Override
	
	public String toString(){
		String str = name+" "+id;
		return str;
	}*/
	

}
