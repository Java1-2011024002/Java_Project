package Sample_0502;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj1 = new Box(10, 20, 50);
		Box obj2 = new Box(10, 30, 30);
		int x = 10;
		
		System.out.println(obj1.getH() + " " + obj2.getH());
		
		Box large = obj1.largest(obj1, obj2, x);
		
		System.out.println("after" + obj1.getH() + " " + obj2.getH() + " " + x);
		
	}

}
