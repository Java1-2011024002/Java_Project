package Sample_0425;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	public Account(int regNumber, String name, int balance) {
		// TODO Auto-generated constructor stub
		this.regNumber = regNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
		this.regNumber = 10;
		this.name = "goo";
		this.balance = 10000;
	}
	
	public String getName(){ return name; }
	public void setName(String name){ this.name = name;}
	public int getBalance(){ return balance;}
	public void setBalance(int balance){ this.balance = balance;}
}
