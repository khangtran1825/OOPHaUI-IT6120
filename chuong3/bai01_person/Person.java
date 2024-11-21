package bai01_person;

import java.util.Scanner;

public class Person {
	// Object's Properties
	protected String name;
	protected String dob;
	protected String pob;
	protected char gender;
	protected String email;
	protected String phone;

	// Constructor Methods
	public Person() {
	}

	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	// Getter Methods
	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getPob() {
		return pob;
	}

	public char getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// Others Methods
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten: ");
		name = sc.nextLine();
		System.out.print("Nhap ngay sinh: ");
		dob = sc.nextLine();
		System.out.print("Nhap noi sinh: ");
		pob = sc.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
		System.out.print("Nhap so dien thoai: ");
		phone = sc.nextLine();

	}

	public void hienthi() {
		System.out.print("\nTen: " + name);
		System.out.print("\nNgay sinh: " + dob);
		System.out.print("\nNoi sinh: " + pob);
		if (gender == 'M')
			System.out.print("\nGioi tinh: Nam");
		else if (gender == 'F')
			System.out.print("\nGioi tinh: Nu");
		else
			System.out.print("\nGioi tinh: Khong ro");
		System.out.print("\nEmail: " + email);
		System.out.print("\nSDT: " + phone);
	}

}
