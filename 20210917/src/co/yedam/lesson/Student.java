package co.yedam.lesson;

/*
 * �л��̸�, ����ó, �ּ�
 */
public class Student {
	private String studentName;
	private String phone;
	private String address;
	
	public Student(String studentName, String phone, String address) {
		this.studentName = studentName;
		this.phone = phone;
		this.address = address;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
}
