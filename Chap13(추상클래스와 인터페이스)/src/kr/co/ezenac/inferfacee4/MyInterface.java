package kr.co.ezenac.inferfacee4;

public interface MyInterface {

	int MAX_NUM = 100;
	public void method();
	
	default void dMethod() {
		System.out.println("디폴트 메서드 호출");
	}
	static void sMethod() {
		System.out.println("정적 메서드 호출");
	}
	private void pMethod() {
		System.out.println("private 메서드 호출");
	}
	private static void psMethod() {   //내부에서만 쓰이는 static 메서드
		System.out.println("private static 메서드 호출");
	}
}
