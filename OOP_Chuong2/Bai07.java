package chuong2;

import java.util.Scanner;

public class Bai07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float firstNum = sc.nextFloat();
		float secNum = sc.nextFloat();
		char key = sc.next().charAt(0);

		if (key == 'A')
			System.out.println("Tong: " + (firstNum + secNum));
		else if (key == 'S')
			System.out.println("Hieu: " + (firstNum - secNum));
		else if (key == 'M')
			System.out.println("Tich: " + (firstNum * secNum));
		else if (key == 'D')
			System.out.println("Thuong: " + ((float) firstNum / secNum));
		else
			System.out.println("Ky tu nhap khong hop le!");

		sc.close();
	}
}
