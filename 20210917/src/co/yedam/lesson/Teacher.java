package co.yedam.lesson;

/*
 * 이름, 과목
 */
public class Teacher {
	// 필드..
	private String name;
	private String major;
	
	// 생성자
	// Teacher t1 = new Teacher(); => 공간만드는걸 인스턴스 생성한다 라고 함.
	public Teacher(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	// 메소드
	public void setName(String name) {  // 굳이 왜만드냐? => 이름만 변경하고 싶을때
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
