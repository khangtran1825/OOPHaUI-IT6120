package bai06_employee;

import java.util.Scanner;

public class Employee extends Person {
	// Object's Properties
	protected String employerID;
	protected float hsl;
	protected String dateHired;

	// Constructor Methods
	public Employee() {
		super();
	}

	public Employee(String employerID, float hsl, String dateHired, String name, int age, char gender) {
		super(name, age, gender);
		this.employerID = employerID;
		this.hsl = hsl;
		this.dateHired = dateHired;
	}

	// Getter Methods
	public String getEmployerID() {
		return employerID;
	}

	public float getHsl() {
		return hsl;
	}

	public String getDateHired() {
		return dateHired;
	}

	// Setter Methods
	public void setEmployerID(String employerID) {
		this.employerID = employerID;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	// Other Methods
	@Override
	public String toString() {
		return "Employee [employerID=" + employerID + ", hsl=" + hsl + ", dateHired=" + dateHired + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("\nNhap ID: ");
		employerID = sc.nextLine();
		System.out.print("Nhap he so luong: ");
		hsl = sc.nextFloat();
		sc.nextLine();
		System.out.print("Nhap ngay tuyen: ");
		dateHired = sc.nextLine();
	}

	public void output() {
		super.output();
		System.out.print("\nID: " + employerID);
		System.out.print("\nHe so luong: " + hsl);
		System.out.print("\nNgay tuyen: " + dateHired);
	}
}
