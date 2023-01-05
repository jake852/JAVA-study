package kr.co.ezenac.thread01;

/**
 * 
 * 여러 개의 스레드 동시 실행
 * 	- 20 미만 짝수 출력
 * 	- 10 미만 수 출력 
 *
 */

public class MultiThreadTest {

	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			for(int i=2; i<20; i=i+2) { 
				System.out.print(i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
			
	};
		
		
		Runnable task2 = () -> {
			
			for(int i=9; i>0; i--) {
				System.out.print("(" + i + ")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
			
	};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		thread1.start();
		thread2.start();
	}
	
}
