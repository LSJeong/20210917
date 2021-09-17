package co.yedam.member;

public class Member {
	// user1(아이디), 홍길동(이름), 대구중구남일동(주소)
	private String memberId;
	private String name;
	private String address;
	
	// 생성자: 필드의 값을 초기화.
	public Member() {
//		memberId = "user1";
//		name = "ParkJiwon";
//		address = "대구중구 내일동";
	}
	
	public Member(String mId){
		memberId = mId;
	}
	
	public Member(String mId, String n, String a){
		memberId = mId;
		name = n;
		address = a;
	}
	
	//메소드
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberId;  // 반환해주는 필드 : 아이디
	}
	
	public String getName() {
		return name; // 반환해주는 필드 : 이름
	}
	
	public String getaddress() {
		return address; // 반환해주는 필드 : 주소
	}
	
	public void showInfo() {
		System.out.println("아이디: " + memberId + ", 이름: " + name + ", 주소: " + address);
	}
	
	public void showMemberId() {
		System.out.println("아이디: " + memberId);
	}
	
	public void showname() {
		System.out.println("이름: " + name);
	}
	
	public void showaddress() {
		System.out.println("주소: " + address);
	}
}
