package co.yedam.inheritance;

import co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {
	
	public Bus() {
		super();
	}
	
	// �ٸ���Ű���� protected Ÿ��, ����ϸ� ��� ����
	@Override
	protected void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	// �ٸ� ��Ű���� defaultŸ��, ����ص� x
//	@Override
//	public void stop() {
//		super.stop();
//	}   
}
