package kr.co.ezenac.singleton02;

public class CarFactroyTest {

	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance();
		Car bMwi4 = carFactory.createCar();
		Car bMwiX = carFactory.createCar();
		
		System.out.println(bMwi4.getCarNum());
		System.out.println(bMwiX.getCarNum());
		
	}
}
