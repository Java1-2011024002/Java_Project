package Sample_0425;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj1 = new Account(12, "goo1", 1000);
		Account obj = new Account();
		
		
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("name : " + obj.getName() + " balance : " + obj.getBalance());
	}

}
