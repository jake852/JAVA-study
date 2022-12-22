package kr.co.ezenac.array02;

class BoxA4{
	public String name;

	public BoxA4(String name) {
		//super();
		this.name = name;
	}
	
}

public class BoxArray {

	public static void main(String[] args) {
		
		BoxA4[] arr = new BoxA4[3];  // 3개의 크기를 만들었고 거기에는 null이 들어가있다. ex) null | null | null
		
		//배열에 객체 저장(초기화)
		arr[0] = new BoxA4("이순신");
		arr[1] = new BoxA4("이순신2");
		arr[2] = new BoxA4("이순신3");
		
		//저장된 객체의 참조
		System.out.println(arr[0].name);    // 6.public으로 설정해놨기 때문에 .name을 가져올수있다.
		System.out.println(arr[1].name);
		System.out.println(arr[2].name);				
		
	}
	
}
