package bai06_employee;

import java.util.Scanner;

public class Person {
	// Object's Properties
	protected String name;
	protected int age;
	protected char gender;

	// Constructor Methods
	public Person() {
		super();
	}

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// Getter Methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int tuoi) {
		this.age = tuoi;
	}

	public void setGender(char gioiTinh) {
		this.gender = gioiTinh;
	}

	// Other Methods
	@Override
	public String toString() {
		return "Nguoi [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten: ");
		name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		age = sc.nextInt();
		System.out.print("Nhap gioi tinh: ");
		gender = sc.next().charAt(0);
		sc.nextLine();
	}

	public void output() {
		System.out.print("\nTen: " + name);
		System.out.print("\nTuoi: " + age);
		System.out.print("\nGioi tinh: " + gender);
	}
}
