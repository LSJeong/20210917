package co.yedam.inherit;

/*
 * 상속: 부모 -> 자식.
 * extends Object 안써줘도 기본적으로 Object 상속받고있음
 */
public class People extends Object {
	private String name;
	private String ssn;

	public People() {

	}

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public void showInfo() {
		System.out.println("이름은 " + name + ", 주민번호: " + ssn);
	}
	
	// 마우스오른쪽 - Source - Generate toString~
	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}

}
