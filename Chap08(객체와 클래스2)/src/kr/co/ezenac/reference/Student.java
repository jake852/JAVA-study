package kr.co.ezenac.reference;

public class Student {

	int studentId; //기본형
	String studentName;
	
	Subject korea; //참조형
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korea = new Subject(); // 참조변수니까 객체를 생성
		math = new Subject();
		
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	//setMathSubject()
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
	
}
