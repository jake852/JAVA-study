package kr.co.ezenac.exception;

public class AutoCloseableTset implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 clsoe() 되었습니다.");
		
	}
	
}
