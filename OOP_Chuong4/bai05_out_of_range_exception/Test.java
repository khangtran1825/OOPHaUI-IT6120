package bai05_out_of_range_exception;

import java.util.Scanner;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap luong: ");
		int luong = sc.nextInt();

		try {
			if (luong < 5000000 || luong > 20000000)
				throw new OutOfRangeException();
			System.out.print("Luong hop le");
		} catch (OutOfRangeException ore) {
			System.out.print("Loi: " + ore.getMessage());
		}
		sc.close();
	}
}
