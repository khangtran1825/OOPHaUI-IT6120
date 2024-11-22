package chuong2;

import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 100; i < 1000; i++) {
			int hangTram = i / 100;
			int hangChuc = (i - (hangTram * 100)) / 10;
			int hangDV = i - (hangTram * 100) - (hangChuc * 10);

			if (Math.pow(hangTram, 3) + Math.pow(hangChuc, 3) + Math.pow(hangDV, 3) == i)
				System.out.print(i + " ");
//			if (i < 105)
//				System.out.println(hangTram + " " + hangChuc + " " + hangDV);
		}

		scanner.close();
	}
}
