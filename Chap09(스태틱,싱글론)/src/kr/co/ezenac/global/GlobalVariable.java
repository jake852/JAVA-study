package kr.co.ezenac.global;

class Cat{
	static int global = 5;		//static 변수
	int num = 3;				//instance 변수

	public void printValue(int num) {
		this.num = num;
		System.out.println("num : " + this.num);
		System.out.println("global : " + Cat.global);
	}
}

public class GlobalVariable {

	public static void main(String[] args) {		//프로그램 시작 지점
		int num1 = 5;								//지역변수
		int num2 = 2;
		System.out.println(num1 +", " + num2 );
		
		Cat cat1 = new Cat();						//지역변수(참조변수) --> 스택 영역에 생성
		Cat.global = 10;							//static 변수에 직접 접근 , 인스턴스 생성과 상관 없이 사용 가능하므로 클래스이름으로 직접 참조 가능(권장)
		cat1.printValue(20);						//인스턴스 메서드 호출
		System.out.println(cat1.num);
		System.out.println(cat1.global);
		System.out.println(Cat.global);
		
		Cat cat2 = new Cat();
		cat2.num = 2;
		Cat.global = 11;
		cat2.printValue(10);
		System.out.println(cat2.num);
		System.out.println(cat2.global);
		System.out.println(Cat.global);
		
		
	}
	
	
}
