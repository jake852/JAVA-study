package kr.co.ezenac.nongeneric;

public class GenericThreeDPrinter<T> {  //<T>를 넣음으로써 아래 타입을 일반화

	
	private T material; 			// T 자료형으로 선언한 (참조)변수 

	
	public T getMaterial() {		// T 자료형을 반환하는 제네릭 메서드 
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
		public String toString() {
		
			return material.toString();
		}
	
	
}
