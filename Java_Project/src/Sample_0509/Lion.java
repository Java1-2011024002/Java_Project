package Sample_0509;

public class Lion extends Animal{
	private int legs = 4;
	
	public Lion() {
		// TODO Auto-generated constructor stub
		System.out.println("�� ������ �ٸ��� "+this.legs+"�� �Դϴ�.");
	}
	
	void roar(){
		System.out.println("roar()�� ȣ�� �Ǿ���");
	}

	void setPicture(String s){
		picture = s;
		System.out.println(picture);
	}
}
