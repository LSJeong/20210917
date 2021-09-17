package co.yedam.person;

import co.yedam.lesson.Student;

/*
 * �̸�, Ű, ������, ������, ����
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
	
	//���콺 ������ - Source - �ؿ��� ������ ~Flied �ϸ� ������ ����� ��
	public Person(String name, double height, double weight, String blood, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
	}
	
	//���콺 ������ - Source - ~~Getters and Setter : set , get �޼ҵ� ��������
	
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
