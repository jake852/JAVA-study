package kr.co.ezenac.lambda04;

//public interface TriFunction {
//
//	public int add(int x, int y, int z);
//}


@FunctionalInterface
public interface TriFunction <T, U, V, R> {
	
	R apply(T t, U u,V v);
}

	
