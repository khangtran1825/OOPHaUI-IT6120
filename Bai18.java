package chuong2;

import java.util.Scanner;

public class Bai18 {
	public static boolean nguyenTo(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return n > 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		if (nguyenTo(num))
			System.out.println("La so nguyen to");
		else
			System.out.println("Khong la so nguyen to");

		scanner.close();
	}
}
