package kr.co.ezenac.constant;

public class TypeChange02 {
	public static void main(String[] args) {
		
		byte num1 = 1;
		byte num2 = 2;
		//byte result = num1 + num2;  // <== 정수기 때문에 자동으로 기본값 int로 취급됨(?)
 		byte result = (byte)(num1 +num2);
		
 		
 		int num3 = 1;
 		int num4 = 2;
 		int resule2 = num3 + num4;
 		
 		long num5 = 1;
 		long num6 = 2;
 		long result3 = num3 + num4;           // 자동 형변환
 		
 		float num7 = 1.0f;
 		float num8 = 2.0f;
 		float reslut4 = num7 + num8;
	
 		double num9 = 1.0;
 		double num10= 2.0;
 		double result4 = num7 + num8;			// 자동 형변환
 				
	}
}
