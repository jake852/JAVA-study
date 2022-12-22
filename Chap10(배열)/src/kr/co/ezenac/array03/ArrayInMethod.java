package kr.co.ezenac.array03;

public class ArrayInMethod {

	public static void main(String[] args) {
		
		int[] arr = makeIntArray(5);				// 10. static이니까 바로 가져올수있다.  11. arr랑은 별개다.
		int sum = sumOfArray(arr);
		System.out.println(sum);
	}
	
	public static int[] makeIntArray(int len) { 
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) 
			arr[i] = i;
		
		
		return arr;
	}
	
	public static int sumOfArray(int[] arr) {		// static이니까 객체생성없이 바로 호출할수있다.  매개변수 타입으로도 Array가능
		int sum = 0;
		for(int i=0; i<arr.length; i++) 
			sum += arr[i];
			return sum;
		
	}
	
}
