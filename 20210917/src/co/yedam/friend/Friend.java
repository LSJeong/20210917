package co.yedam.friend;
//이름, 연락처, email, 키, 몸무게
public class Friend {
	private String name;
	private String phone;
	private String email;
	private double height;
	private double weight;
	
	public Friend(String name, String phone, String email, double height, double weight) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.printf("[이름: %s, 연락처: %s, 이메일: %s, 키: %.1f, 몸무게: %.1f] \n", name, phone, email, height, weight);
	}
	
}
