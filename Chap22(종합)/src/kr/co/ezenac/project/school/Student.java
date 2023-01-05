package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class Student {
	
	private String StudentName;		 //이름
	private int StudentId;			 //학번
	private Subject majorSubject;	 //전공
	private ArrayList<Score> scores = new ArrayList<>();	// 성적리스트 
	
	
	public Student(String studentName, int studentId, Subject majorSubject) {
		//super();
		StudentName = studentName;
		StudentId = studentId;
		this.majorSubject = majorSubject;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public int getStudentId() {
		return StudentId;
	}


	public Subject getMajorSubject() {
		return majorSubject;
	}


	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}


	public void setStudentId(int studentId) {
		StudentId = studentId;
	}


	public ArrayList<Score> getScores() {
		return scores;
	}


	public void addSubjectScores(Score score) {
		scores.add(score);
		
	}

	
}
