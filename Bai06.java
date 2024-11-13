package chuong2;

import java.util.Scanner;

public class Bai06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int soThu1 = scanner.nextInt();
		int soThu2 = scanner.nextInt();

		System.out.println("Tong: " + (soThu1 + soThu2));
		System.out.println("Hieu: " + (soThu1 - soThu2));
		System.out.println("Tich: " + (soThu1 * soThu2));
		System.out.println("Thuong: " + ((float) soThu1 / soThu2));

		scanner.close();
	}
}
