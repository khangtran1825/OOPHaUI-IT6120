package chuong2;

import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap so luong phan tu: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		System.out.print("Nhap mang: ");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.print("Hien mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		scanner.close();
	}
}
