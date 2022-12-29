package kr.co.ezenac.lambda04;


public class TestTriFunction {

	public static void main(String[] args) {
//		TriFunction add = (x, y, z) -> x + y +z;
//		System.out.println(add.add(3, 4, 5));
		
		TriFunction <Integer, Integer, Integer, Integer> addThreeNums = (x, y, z) -> x + y +z;
		int result = addThreeNums.apply(3, 2, 5);
		System.out.println(result);
	}
}
