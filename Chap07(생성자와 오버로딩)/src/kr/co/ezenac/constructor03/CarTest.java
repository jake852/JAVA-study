package kr.co.ezenac.constructor03;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car);
		
		System.out.println();
		
		Car car2 = new Car("흰색", "오토", 4);
		System.out.println(car2);
	}
	
}
