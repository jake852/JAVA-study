package kr.co.ezenac.arraylist02;

/*
 *  Ezen 학원에 학생 3명 있습니다.
 *  각 학생마다 읽은 책을 기록하고 있습니다.
 *  학생마다 읽은 책을 Student 클레스 내에 ArrayList를 생성하여 관리하도록 합니다.
 *  다음과 같이 출력되게 클래스를 만들어서 실행하시오 
 *  
 *  Lee 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다.
 *  Shin 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다.
 *  Kim 학생이 읽은 책은 : 머신러닝1, 머신러닝2, 머신러닝3, 머신러닝4, 머신러닝5, 머신러닝6 입니다.
 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentL = new Student(1000, "Lee");
		studentL.addBook("운영체제1, 운영체제2 ", "홍길동"); // 하나씩 해도 된다.
		
		Student studentS = new Student(1001, "Shin");
		studentS.addBook("딥러닝1, 딥러닝2, 딥러닝3", "민규식");
		
		Student studentK = new Student(1002, "Kim");
		studentK.addBook("머신러닝1, 머신러닝2, 머신러닝3, 머신러닝4, 머신러닝5, 머신러닝6", "서지영");
		
		
		studentL.showInfo();
		System.out.println();
		
		studentS.showInfo();
		System.out.println();
		
		studentK.showInfo();
		System.out.println();
		
	}
	
}
