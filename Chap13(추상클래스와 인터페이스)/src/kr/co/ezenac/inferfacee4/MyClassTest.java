package kr.co.ezenac.inferfacee4;

public class MyClassTest {

	public static void main(String[] args) {
		MyInterface myInterface = new MyClass();
		myInterface.dMethod();
		myInterface.method();
		
		MyInterface.sMethod();
		
	}
	
}
