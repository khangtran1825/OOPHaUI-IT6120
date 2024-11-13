package chuong2;

import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap ban kinh: ");
		float banKinh = scanner.nextFloat();

		System.out.printf("Chu vi: %.1f", banKinh * 6.28);
		System.out.printf("\nDien tich: %.1f", banKinh * banKinh * 3.14);

		scanner.close();
	}
}
