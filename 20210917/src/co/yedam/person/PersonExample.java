package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		// p1, p2, p3
		// family => ��������(�̸�, ������, ����) : ��1.
		// Ű�� 165�̻� ������ ���(�̸�, Ű, ������) : ��2.
		// �������� AB���� ������ ���(�̸�, ������) : ��3.
	
		Person p1 = new Person("�̼���", 160.3, 45.2, "A", 25);
		Person p2 = new Person("ȫ�浿", 178.9, 75.4, "O", 29);
		Person p3 = new Person("��ö��", 180.7, 89.1, "AB", 21);
		
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		
//		p1.setName("�̼���");
//		p1.setHeight(160.3);
//		p1.setWeight(45.2);
//		p1.setBlood("A");
//		p1.setAge(25);
//		
//		p2.setName("ȫ�浿");
//		p2.setHeight(178.9);
//		p2.setWeight(75.4);
//		p2.setBlood("O");
//		p2.setAge(29);
//		
//		p3.setName("��ö��");
//		p3.setHeight(180.7);
//		p3.setWeight(89.1);
//		p3.setBlood("AB");
//		p3.setAge(21);
		
		
		Person family[] = {p1, p2, p3};
		
		for (int i = 0; i < family.length; i++) {
			System.out.println(
					"�̸�: " + family[i].getName() + ", ������: " + family[i].getBlood() + ", ����: " + family[i].getAge());
		}
		System.out.println("===============��1.==============");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getHeight() >= 165)
				System.out.println("�̸�: " + family[i].getName() + ", Ű: " + family[i].getHeight() + ", ������: "
						+ family[i].getWeight());
		}
		System.out.println("===============��2.==============");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getBlood().equals("AB"))
				System.out.println("�̸�: "+ family[i].getName() + ", ������: " + family[i].getBlood());
		}
		System.out.println("===============��3.==============");
	}
	
	
}
