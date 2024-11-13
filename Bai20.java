package chuong2;

import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap do C: ");
		float doC = scanner.nextFloat();

		float doF = (float) (doC * 1.8 + 32);
		System.out.println("Do F: " + doF);

		scanner.close();
	}
}
