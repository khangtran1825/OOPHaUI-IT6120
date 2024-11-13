package chuong2;

public class Bai01 {
	public static void main(String[] args) {
		System.out.print("a, ");
		int i = 5;
		int j = 6;
		int x = i++ + ++j;
		System.out.println(x);

		System.out.print("b, ");
		i = 10;
		j = 11;
		x = --i + j--;
		System.out.println(x);

		System.out.print("c, ");
		i = 5;
		j = 2;
		x = i % j;
		float y = i / j;
		System.out.println(x + " " + y);

		System.out.print("d, ");
		i = 5;
		j = 2;
		float x1 = (float) i / j;
		System.out.println(x1);

		System.out.print("e, ");
		i = 5;
		j = 2;
		float x2 = i / (float) j;
		System.out.println(x2);

		System.out.print("c, ");
		i = 5;
		j = 2;
		float x3 = (float) i / (float) j;
		System.out.println(x3);

	}
}
