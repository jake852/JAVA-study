package kr.co.ezenac.field02;
						
							
public class FieldInit /* extends Object << 표시를 안해도 선언되어 있는것이다. */ {

	// 멤버변수는 초기화안해도 컴파일러가 디폴트값을 줌.
	// 기본형 변수
	byte byteField;				//1 byte
	short shortField;			//2
	int intField;				//4
	long longField;				//8
	
	boolean booleanField;		//1
	char charField;				//2
	
	float floatField;			//4
	double doubleField;			//8
	
	//참조형 변수의 기본은 null(가리키는곳이없다)
	int[] arrField;				//4
	String strField;			//4
	
	
	/*
	 *  클래스의 멤버변수 멤버변수(필드)의 값들을 수시로 확인하고자 할때나,
	 *  원하는 포캣으로 멤버변수들을 출력하고자 할때 많이 사용함.
	 */
	
	@Override 
	public String toString(){
		
		String str = "byteFiel : " + byteField +
					 ", shortField : " + shortField +
					 ", intField : " + intField +
					 ", longField : " + longField +
					 ", booleanField : " + booleanField +
					 ", charField : " + charField +
					 ", floatField : " + floatField +
					 ", doubleField : " + doubleField + 
					 ", arrField : " + arrField + 
					 ", strField : " + strField;
					 
		return str;
		
	}
	
}
