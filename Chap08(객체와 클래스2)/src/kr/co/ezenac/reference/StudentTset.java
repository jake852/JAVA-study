package kr.co.ezenac.reference;

public class StudentTset {

	public static void main(String[] args) {
		
		Student student = new Student(100, "이순신");
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 80);
		
		
		student.showStudentScore();
		
		/*
		 * Student2로 만들어봐라.
		 */
	}
	
}
