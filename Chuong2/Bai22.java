package chuong2;

import java.util.Scanner;

public class Bai22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap so luong phan tu: ");
		int n = scanner.nextInt();
		float[] a = new float[n];
		float sum = 0;

		System.out.print("Nhap mang: ");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextFloat();
		}

		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.print("Tong cac pt: " + sum);

		scanner.close();
	}
}
