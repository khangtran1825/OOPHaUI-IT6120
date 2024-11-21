package bai08_shape;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();

		System.out.print("Nhap chieu dai: ");
		int cd = sc.nextInt();
		System.out.print("Nhap chieu rong: ");
		int cr = sc.nextInt();
		System.out.print("Nhap chieu cao: ");
		int cc = sc.nextInt();
		System.out.print("Nhap canh day: ");
		int cdd = sc.nextInt();

		rec.setLength(cd);
		rec.setWidth(cr);

		tri.setBase(cdd);
		tri.setHeight(cc);

		System.out.println("Dien tich hinh chu nhat: " + rec.getArea());
		System.out.println("Dien tich hinh tam giac: " + tri.getArea());
		sc.close();
	}
}
