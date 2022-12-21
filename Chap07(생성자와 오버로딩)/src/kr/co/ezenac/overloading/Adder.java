package kr.co.ezenac.overloading;

public class Adder {

	//add() 메서드명으로 오버로딩함
	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x + y;
	}
	
//	public int add(int a, int b) {  변수명이 같은건 오버로딩이 아니다
//		return a + b;
//	}
	
//	public long add(int x, int y) {  리턴 타입이 다르면 오버로딩이 아니다
//		return x + y;
		
	public long add(int x, long y) { // int면 자동으로 int로 되고, long이면 자동으로 long이 된다.
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	
}
