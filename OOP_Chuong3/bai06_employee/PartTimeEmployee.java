package bai06_employee;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
	// Object's Properties
	protected int hourPerWeek;

	// Constructor Methods
	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int hourPerWeek) {
		super();
		this.hourPerWeek = hourPerWeek;
	}

	// Getter Method
	public int getHourPerWeek() {
		return hourPerWeek;
	}

	// Setter Method
	public void setHourPerWeek(int hourPerWeek) {
		this.hourPerWeek = hourPerWeek;
	}

	// Other Methods
	@Override
	public String toString() {
		return "PartTimeEmployee [hourPerWeek=" + hourPerWeek + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("Nhap so gio/tuan: ");
		hourPerWeek = sc.nextInt();
	}

	public void output() {
		super.output();
		System.out.print("\nSo gio/tuan: " + hourPerWeek);
	}
}
