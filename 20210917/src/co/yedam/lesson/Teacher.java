package co.yedam.lesson;

/*
 * �̸�, ����
 */
public class Teacher {
	// �ʵ�..
	private String name;
	private String major;
	
	// ������
	// Teacher t1 = new Teacher(); => ��������°� �ν��Ͻ� �����Ѵ� ��� ��.
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	// �޼ҵ�
	public void setName(String name) {  // ���� �ָ����? => �̸��� �����ϰ� ������
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
}
