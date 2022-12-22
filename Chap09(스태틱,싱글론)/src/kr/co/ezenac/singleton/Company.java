package kr.co.ezenac.singleton;

public class Company {

	private static Company instance = new Company();  // 클래스 내부에 유일한 private 인스턴스 생성
	
	private Company() {
		
	}
	
	public static Company getInstance() { 
		if(instance == null)
			instance = new Company();
		
		return instance;
	}
}

