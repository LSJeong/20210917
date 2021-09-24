package co.yedam.inheritance;

import co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {
	
	public Bus() {
		super();
	}
	
	// 다른패키지의 protected 타입, 상속하면 사용 가능
	@Override
	protected void run() {
		System.out.println("버스가 달립니다.");
	}

	// 다른 패키지의 default타입, 상속해도 x
//	@Override
//	public void stop() {
//		super.stop();
//	}   
}
