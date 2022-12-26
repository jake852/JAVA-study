package kr.co.ezen.object;

/*
 *  날짜를 구현한 클래스 MyDate
 *  날짜가 같으면 equals() 메서드 결과가 true가 되도록 구현하시오.
 *  
 *  hashCode() 메서드도 구현해 보시오.
 */

class MyDate{
	
	private int month;
	private int day;
	private int years;
	
	public MyDate(int month, int day, int years) {
		//super();
		this.month = month;
		this.day = day;
		this.years = years;
	}
	
	@Override
	public int hashCode() {
		return month*10 + day*70 + years*1000;   // 어떤것을 해도 상관X
	}
	
	@Override
	public boolean equals(Object obj) {
	
		
		if(obj instanceof MyDate) {
			MyDate data = (MyDate)obj;
			if((this.month == data.month) && (this.day == data.day) && (this.years == data.years))
				return true;
			else
				return false;
		}
		
		return false;
	}
	
}

public class MyDateTest {

	
	public static void main(String[] args) {
	

	
	MyDate date1 = new MyDate(2, 9, 2022);
	MyDate date2 = new MyDate(2, 9, 2022);
	
	System.out.println(date1.equals(date2));
	
	
	System.out.println(date1.hashCode());
	System.out.println(date2.hashCode());
	
	}
	


}
