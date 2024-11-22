package chuong2;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int giaiThua = 1;

		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
		}

		System.out.println("Giai thua: " + giaiThua);

		scanner.close();
	}
}
