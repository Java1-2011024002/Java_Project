package Sample_0509;

class Par{
	public Par(){
		System.out.println("Par Con");
		}
	
	public Par(int a){
		System.out.println("Par Con" + a);
	}
}

class Child extends Par{
	public Child(int y) {
		// TODO Auto-generated constructor stub
		super(y);
		System.out.println("Child con");
	}
	
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Child con nothing");
	}
	
}

public class Con_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c1 = new Child(4);
		Child c2 = new Child();
	}

}
