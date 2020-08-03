package entites;

public class Account {
	private String pancard;
	 private double balance;
	public Account(String pancard,double balance){
		this.pancard=pancard;
		this.balance=balance;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
