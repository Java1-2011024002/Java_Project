package Sample_0509;

abstract class Animalmal{//추상클레스
	abstract void sound();//추상메서드
	/*{
		System.out.println("animal"); //자식클레스에서 오버라이딩을 활용하기위해 만든 메서드
	}*/
}

class Dog extends Animalmal{
	private int d = 11;
	@Override
	void sound(){
		System.out.println("멍멍"+d);
	}
}

class Cat extends Animalmal{
	private int c = 99;
	@Override
	void sound(){
		System.out.println("야옹"+c);
	}
}
public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animalmal a = new Animalmal();
		Animalmal b = new Dog();
		Animalmal c = new Cat();
		
		//a.sound();
		b.sound();
		c.sound();

		//test(a);
		test(b);
		test(c);
	}
	

	static void test(Animalmal temp/*클래스 객체*/){
		temp.sound();
		}

}
