package kr.co.ezenac.inferfacee6;

public class EzenClassTest {

	public static void main(String[] args) {
		EzenClass eClass = new EzenClass();
		
		X xClass = eClass;
		xClass.x();
		
		Y yClass = eClass;
		yClass.y();
		
		EzenClass iClass = eClass;
		iClass.x();
		iClass.y();
		iClass.myMthod();
	}
	
}
