package co.yedam.member;

import co.yedam.Student;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "박미림", "대구 중구 내일동"); //생성자 호출
		m1.showInfo();
		
//		m1.memberId = "user1";
		m1.setMemberId("user1");
//		m1.name = "Hong";
		m1.setName("Hong");
//		m1.address = "중구 남일동";
		m1.setAddress("중구 남일동");
		
//		System.out.println("아이디: " + m1.memberId);
		System.out.println("아이디: " + m1.getMemberId());
//		System.out.println("이름: " + m1.name);
		System.out.println("이름: " + m1.getName());
//		System.out.println("주소: " + m1.address);
		System.out.println("주소: " + m1.getaddress());
		
		Member m2 = new Member("user2");
		m2.showInfo();
		m2.setName("이소정");
		m2.setAddress("달서구 신당동");
		
		m2.showInfo();
		
		
		Member m3 = new Member("user3","홍길동","대구 서구 신당동");
		m3.showInfo();
//		m3.name = "박길동";
		m3.setName("박길동");
		m3.showInfo();
		
//		m1.memberId = "user1"; 
//		m1.name = "Hong";
//		m1.address = "대구중구 남일동";
		
//		Student s1 = new Student(); //co.yedam패키지안의 Student class 접근 가능(public이므로)
//		s1.name = "Hong";  // name, score가 default로 선언되었기때문에 다른패키지에서 접근 불가능, 에러남 
//		s1.score = 90; // name, score가 default로 선언되었기때문에 다른패키지에서 접근 불가능, 에러남
		
		// public -> 다른 패키지 접근가능
		// private -> 클래스접근가능 그외 접근불가능
		// (default) -> 동일한 패키지 접근가능

		
	}
}
