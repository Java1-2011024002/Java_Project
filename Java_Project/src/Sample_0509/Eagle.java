package Sample_0509;

public class Eagle extends Animal{
	private int wing = 2;
	
	public Eagle() {
		// TODO Auto-generated constructor stub
		System.out.println("이 동물의 날개는 " + this.wing + " 개 입니다.");
	}

	void fly(){
		System.out.println("fly()가 호출되었음");
	}
}
