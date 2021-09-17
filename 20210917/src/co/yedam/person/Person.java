package co.yedam.person;

import co.yedam.lesson.Student;

/*
 * 이름, 키, 몸무게, 혈액형, 나이
 */
public class Person {
	private String name;
	private double height;
	private double weight;
	private String blood;
	private int age;
	
	
//	public Person() {
//		
//	}
	
	//마우스 오른쪽 - Source - 밑에서 세번쨰 ~Flied 하면 생성자 만들어 줌
	public Person(String name, double height, double weight, String blood, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
	}
	
	//마우스 오른쪽 - Source - ~~Getters and Setter : set , get 메소드 생성해줌
	
	public void setName(String name) {
		this.name = name;
	}	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}	
	public double getHeight() {
		return this.height;
	}	
	public double getWeight() {
		return this.weight;
	}	
	public String getBlood() {
		return this.blood;
	}	
	public int getAge() {
		return this.age;
	}
	
	
	
}
