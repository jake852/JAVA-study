package kr.co.ezenac.operator02;

public class DenyTest {

	public static void main(String[] args) {
		
		boolean power = false;
		System.out.println("power 의 값 : " + power);
		
		power = !power;
		System.out.println("power 의 값 : " + power);
		
		power = !power;
		System.out.println("power 의 값 : " + power);
		
		if(!power) {					// if문은 true 일때만 실행된다.
			System.out.println("if문 실행됨");	
		}
		
		if(power) {						// power가 false이므로 실행이 안된다.
			System.out.println("if문 실행됨!!");	
		}
		
	}
}
