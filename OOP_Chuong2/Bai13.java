package chuong2;

import java.util.Scanner;

public class Bai13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float giaBan = scanner.nextFloat();
		float giamGia = scanner.nextFloat();

		System.out.println("Gia: " + (giaBan * (100 - giamGia) / 100));

		scanner.close();
	}
}
