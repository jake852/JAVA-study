package kr.co.ezenac.project.grade;

public class ArtsEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		
		String grade;
		
		if(score>=70 && score<=100)
			grade = "P";
		else
			grade = "F";
		
		return grade;
	}

}
