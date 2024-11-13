package chuong2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap so luong sinh vien: ");
		int n = scanner.nextInt();
		int[] diem = new int[n];
		for (int i = 0; i < n; i++) {
			diem[i] = scanner.nextInt();
		}

		int highest = Arrays.stream(diem).max().getAsInt();
		System.out.println("Diem cao nhat: " + highest);
		System.out.print("Sinh vien co diem cao nhat la: thu ");
		for (int i = 0; i < n; i++) {
			if (diem[i] == highest)
				System.out.print((i + 1) + " ");
		}
		Arrays.sort(diem);
		System.out.print("\nDiem cua sinh vien theo chieu tang dan la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(diem[i] + " ");
		}

		scanner.close();
	}
}
