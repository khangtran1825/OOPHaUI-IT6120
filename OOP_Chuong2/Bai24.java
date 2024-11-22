package chuong2;

import java.util.Scanner;

public class Bai24 {
	public static int arrPos(int a[], int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so luong sinh vien: ");
		int n = scanner.nextInt();
		int[] diem = new int[n];
		for (int i = 0; i < n; i++) {
			diem[i] = scanner.nextInt();
		}
		System.out.print("Nhap diem can tim: ");
		int value = scanner.nextInt();
		int index = arrPos(diem, n, value);
		if (index > 0)
			System.out.println("Sinh vien thu " + (index + 1));
		else
			System.out.println("Khong tim thay");

		scanner.close();
	}

}
