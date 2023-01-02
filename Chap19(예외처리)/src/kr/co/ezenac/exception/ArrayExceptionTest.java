package kr.co.ezenac.exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		
		
		try {
			for(int i=0; i<=5; i++)   // 배열의 크기가 5인데 6이므로 ArrayIndexOutOfBoundsException를 예외처리로 사용
				System.out.println(arr[i]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리");
		}
		System.out.println("프로그램 정상 종료");
	}
	
}

