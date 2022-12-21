package kr.co.ezenac.loop04;

public class WhileTest04 {

	public static void main(String[] args) {
	
		int dan;
		int count;
		
		for(dan = 2; dan<=9; dan++) {
			for(count = 1; count <= 9; count++) {
				System.out.println(dan + "X" + count + "=" + dan*count );
			}
			System.out.println();
		}
		
		dan = 2;		
		while(dan <= 9) {    // 역시나 for문에 비해서 가독성이 떨어진다.
			count =1;
			while(count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan*count );
				count++;
			}
			dan++;
			System.out.println();
		}
		
	}
	
}
