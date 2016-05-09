package Sample_0509;

public class Animal {
	private double weight; //자식클레스에서는 private 로 선언된것을 호출 할 수 없다.
	protected String picture;
	
	void eat(){ System.out.println("eat()가 호출되었음");	}
	void sleep(){ System.out.println("sleep()이 호출되었음");}
	
}
