package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		// p1, p2, p3
		// family => 가족정보(이름, 혈액형, 나이) : 끝1.
		// 키가 165이상 가족만 출력(이름, 키, 몸무게) : 끝2.
		// 혈액형이 AB형인 가족만 출력(이름, 혈액형) : 끝3.
	
		Person p1 = new Person("이소정", 160.3, 45.2, "A", 25);
		Person p2 = new Person("홍길동", 178.9, 75.4, "O", 29);
		Person p3 = new Person("김철수", 180.7, 89.1, "AB", 21);
		
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		
//		p1.setName("이소정");
//		p1.setHeight(160.3);
//		p1.setWeight(45.2);
//		p1.setBlood("A");
//		p1.setAge(25);
//		
//		p2.setName("홍길동");
//		p2.setHeight(178.9);
//		p2.setWeight(75.4);
//		p2.setBlood("O");
//		p2.setAge(29);
//		
//		p3.setName("김철수");
//		p3.setHeight(180.7);
//		p3.setWeight(89.1);
//		p3.setBlood("AB");
//		p3.setAge(21);
		
		
		Person family[] = {p1, p2, p3};
		
		for (int i = 0; i < family.length; i++) {
			System.out.println(
					"이름: " + family[i].getName() + ", 혈액형: " + family[i].getBlood() + ", 나이: " + family[i].getAge());
		}
		System.out.println("===============끝1.==============");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getHeight() >= 165)
				System.out.println("이름: " + family[i].getName() + ", 키: " + family[i].getHeight() + ", 몸무게: "
						+ family[i].getWeight());
		}
		System.out.println("===============끝2.==============");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getBlood().equals("AB"))
				System.out.println("이름: "+ family[i].getName() + ", 혈액형: " + family[i].getBlood());
		}
		System.out.println("===============끝3.==============");
	}
	
	
}
