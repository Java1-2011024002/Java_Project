package Sample_0509;

public class Lion extends Animal{
	private int legs = 4;
	
	public Lion() {
		// TODO Auto-generated constructor stub
		System.out.println("이 동물의 다리는 "+this.legs+"개 입니다.");
	}
	
	void roar(){
		System.out.println("roar()가 호출 되었음");
	}

	void setPicture(String s){
		picture = s;
		System.out.println(picture);
	}
}
