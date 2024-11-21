package bai01_arithmetic_exception;

import java.util.Scanner;

public class Bai01_Arithmetic_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nguyen thu 1: ");
		int num1 = sc.nextInt();
		System.out.print("Nhap so nguyen thu 2: ");
		int num2 = sc.nextInt();

		try {
			float res = (float) (num1 / num2);
			System.out.print("Hieu cua 2 so la: " + res);
		} catch (ArithmeticException e) {
			System.out.print("Loi: Mau so khong the = 0");
		}

		sc.close();
	}
}
