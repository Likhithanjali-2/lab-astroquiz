package model;

public class User{
	private String name;
	private String number;
	private int age;
	private int height;
	private int weight;
	private String country;
	public User(String name, String number, int age, int height, int weight, String country) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.height = height;
		this.country = country;
		this.weight = weight;
	}
	//getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setCountry(String country) {
		this.country = country;
	}
//
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String getCountry() {
		return country;
	}
}