package kr.co.ezenac.exception;

public class AutoCloseableTsetMain {

	public static void main(String[] args) {
		
		AutoCloseableTset obj = new AutoCloseableTset();
		try(obj) {
			System.out.println("프로그램 실행");
			throw new Exception();  // 강제로 예외를 발생시킨 것이다.
		} catch (Exception e) {
			System.out.println("예외 처리 부분입니다.");
			
		}
	}
	
}
