package Sample_0502;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of Car : " + Car.numbers);
		
		Car c1 = new Car("S600", "black", 80);
		
		System.out.println("Number of Car : " + Car.numbers);
		
		Car c2 = new Car("Audi R8", "white", 100);
		
		System.out.println("Number of Car : " + Car.numbers);
		
		System.out.println(Car.Car_Numbers());
	}	

}
