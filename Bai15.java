package chuong2;

import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int soNgay = scanner.nextInt();
		int donGia = scanner.nextInt();
		float thanhTien;

		if (soNgay == 1)
			thanhTien = donGia;
		else if (soNgay >= 2 && soNgay <= 4)
			thanhTien = donGia + ((soNgay - 1) * donGia * 80 / 100f);
		else if (soNgay >= 5 && soNgay <= 10)
			thanhTien = donGia + 3 * donGia * 80 / 100f + ((soNgay - 4) * donGia * 60 / 100f);
		else
			thanhTien = donGia + 3 * donGia * 80 / 100f + 6 * donGia * 60 / 100f + ((soNgay - 10) * donGia * 60 / 100f);

		System.out.println("Thanh tien: " + thanhTien);

		scanner.close();
	}
}
