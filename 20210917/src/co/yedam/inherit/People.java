package co.yedam.inherit;

/*
 * ���: �θ� -> �ڽ�.
 * extends Object �Ƚ��൵ �⺻������ Object ��ӹް�����
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
		System.out.println("�̸��� " + name + ", �ֹι�ȣ: " + ssn);
	}
	
	// ���콺������ - Source - Generate toString~
	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}

}
