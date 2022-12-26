package kr.co.ezenac.templatmethod;

public abstract class Car {

	final public void run() { 		//final을 추가시킴으로써 마지막이니까 오버라이딩 못하게 하기위해 추가 
		startCar();
		drive();
		stop();
		turnOff();
		
	}

	private void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	public abstract void stop();

	public abstract void drive();

	public void startCar() {
		System.out.println("시동을 켭니다.");
		
	}
}
