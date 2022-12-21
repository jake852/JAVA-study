package kr.co.ezenac.constructor03;

//constructor02 ,03일 비교하면서 공부해라!!

public class Car {

	String color;
	String gearType;
	int door;
	
	/*
	 * this
	 * 	- 참조변수와 같은 역할
	 *  - 매개변수와 멤버변수를 구분짖는데 사용
	 *    (this 사용해서 명확하게 프로그램 실행되도록 함)
	 */
	
	public Car() {
		//직접적으로 인스턴스 멤버변수를 초기화
//		this.color = "노랑";
//		this.gearType = "수동";
//		this.door = 4;		

		this("검정","수동", 2);
	}
	
	
	public Car(String color, String gearType, int door) { //기본생성자가 아닌 맴버변수를 활용해서 하기 때문에 Cartest에서 내가 바꿀수있다.
		//super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}


	@Override
	public String toString() {

		return this.color + ", " +
				this.gearType + ", "+
				this.door;
	}
}
