package bai09_rectangle;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();

		System.out.print("Nhap chieu dai: ");
		int cd = sc.nextInt();
		System.out.print("Nhap chieu rong: ");
		int cr = sc.nextInt();

		rec.setLength(cd);
		rec.setWidth(cr);

		System.out.println("Dien tich hinh chu nhat: " + rec.getArea());
		sc.close();
	}
}
