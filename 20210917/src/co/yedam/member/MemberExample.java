package co.yedam.member;

import co.yedam.Student;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "�ڹ̸�", "�뱸 �߱� ���ϵ�"); //������ ȣ��
		m1.showInfo();
		
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "�߱� ���ϵ�";
		m1.setAddress("�߱� ���ϵ�");
		
//		System.out.println("���̵�: " + m1.memberId);
		System.out.println("���̵�: " + m1.getMemberId());
//		System.out.println("�̸�: " + m1.name);
		System.out.println("�̸�: " + m1.getName());
//		System.out.println("�ּ�: " + m1.address);
		System.out.println("�ּ�: " + m1.getaddress());
		
		Member m2 = new Member("user2");
		m2.showInfo();
		m2.setName("�̼���");
		m2.setAddress("�޼��� �Ŵ絿");
		
		m2.showInfo();
		
		
		Member m3 = new Member("user3","ȫ�浿","�뱸 ���� �Ŵ絿");
		m3.showInfo();
//		m3.name = "�ڱ浿";
		m3.setName("�ڱ浿");
		m3.showInfo();
		
//		m1.memberId = "user1"; 
//		m1.name = "Hong";
//		m1.address = "�뱸�߱� ���ϵ�";
		
//		Student s1 = new Student(); //co.yedam��Ű������ Student class ���� ����(public�̹Ƿ�)
//		s1.name = "Hong";  // name, score�� default�� ����Ǿ��⶧���� �ٸ���Ű������ ���� �Ұ���, ������ 
//		s1.score = 90; // name, score�� default�� ����Ǿ��⶧���� �ٸ���Ű������ ���� �Ұ���, ������
		
		// public -> �ٸ� ��Ű�� ���ٰ���
		// private -> Ŭ�������ٰ��� �׿� ���ٺҰ���
		// (default) -> ������ ��Ű�� ���ٰ���

		
	}
}
