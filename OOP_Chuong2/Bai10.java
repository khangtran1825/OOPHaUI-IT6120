package chuong2;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float canh1 = scanner.nextFloat();
		float canh2 = scanner.nextFloat();

		System.out.println("Dien tich: " + (canh1 * canh2));
		System.out.println("Chu vi: " + (2 * (canh1 + canh2)));

		scanner.close();
	}
}
