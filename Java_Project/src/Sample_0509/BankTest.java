package Sample_0509;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("Bad Bank의 이자율 : " + b1.get());
		System.out.println("Normal Bank의 이자율 : " + b2.get());
		System.out.println("Good Bank의 이자율 : " + b3.get());
	}

}
