package chuong2;

import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so dien tieu thu: ");
		float soDien = scanner.nextFloat();
		float donGia;

		if (soDien <= 50 && soDien > 0)
			donGia = soDien * 1484;
		else if (soDien <= 100 && soDien > 50)
			donGia = (soDien - 50) * 1533 + 1484 * 50;
		else if (soDien <= 200 && soDien > 100)
			donGia = (soDien - 100) * 1786 + 1533 * 50 + 1484 * 50;
		else
			donGia = (soDien - 200) * 2242 + 1786 * 100 + 1533 * 50 + 1484 * 50;

		System.out.println("Don gia: " + donGia);
		scanner.close();
	}
}
