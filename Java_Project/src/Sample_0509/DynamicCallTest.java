package Sample_0509;

abstract class Animalmal{//�߻�Ŭ����
	abstract void sound();//�߻�޼���
	/*{
		System.out.println("animal"); //�ڽ�Ŭ�������� �������̵��� Ȱ���ϱ����� ���� �޼���
	}*/
}

class Dog extends Animalmal{
	private int d = 11;
	@Override
	void sound(){
		System.out.println("�۸�"+d);
	}
}

class Cat extends Animalmal{
	private int c = 99;
	@Override
	void sound(){
		System.out.println("�߿�"+c);
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
	

	static void test(Animalmal temp/*Ŭ���� ��ü*/){
		temp.sound();
		}

}
