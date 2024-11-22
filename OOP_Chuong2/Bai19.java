package chuong2;

import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so gio: ");
		int gio = scanner.nextInt();
		System.out.print("Nhap so phut: ");
		int phut = scanner.nextInt();
		System.out.print("Nhap so giay: ");
		int giay = scanner.nextInt();

		int sum = giay + phut * 60 + gio * 3600;
		System.out.println("Tong so giay: " + sum);

		scanner.close();
	}
}
