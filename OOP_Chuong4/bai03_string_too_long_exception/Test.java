package bai03_string_too_long_exception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("\nNhap chuoi kt tu (nhap DONE de ket thuc): ");
			String check = sc.nextLine();

			if (check.equalsIgnoreCase("DONE"))
				break;

			try {
				if (check.length() > 30)
					throw new StringTooLongException();
				System.out.println("Chuoi hop le!");
			} catch (StringTooLongException ste) {
				System.out.print("Loi: " + ste.getMessage());
				break;
			}
		}
		sc.close();
	}
}
