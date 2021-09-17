package co.yedam.member;

public class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸�߱����ϵ�(�ּ�)
	private String memberId;
	private String name;
	private String address;
	
	// ������: �ʵ��� ���� �ʱ�ȭ.
	public Member() {
//		memberId = "user1";
//		name = "ParkJiwon";
//		address = "�뱸�߱� ���ϵ�";
	}
	
	public Member(String mId){
		memberId = mId;
	}
	
	public Member(String mId, String n, String a){
		memberId = mId;
		name = n;
		address = a;
	}
	
	//�޼ҵ�
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
		return memberId;  // ��ȯ���ִ� �ʵ� : ���̵�
	}
	
	public String getName() {
		return name; // ��ȯ���ִ� �ʵ� : �̸�
	}
	
	public String getaddress() {
		return address; // ��ȯ���ִ� �ʵ� : �ּ�
	}
	
	public void showInfo() {
		System.out.println("���̵�: " + memberId + ", �̸�: " + name + ", �ּ�: " + address);
	}
	
	public void showMemberId() {
		System.out.println("���̵�: " + memberId);
	}
	
	public void showname() {
		System.out.println("�̸�: " + name);
	}
	
	public void showaddress() {
		System.out.println("�ּ�: " + address);
	}
}