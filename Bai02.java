package chuong2;

public class Bai02 {
	public static void main(String[] args) {
		boolean a = 2 < 3;
		System.out.println("a, " + a);

		boolean b = 2 < 3 && 4 > 3;
		System.out.println("b, " + b);

		boolean c = 2 < 3 && 4 < 3;
		System.out.println("c, " + c);

		boolean d = !(2 > 4);
		System.out.println("d, " + d);

		boolean e = 2 == 3;
		System.out.println("e, " + e);

		boolean f = 4 != 3;
		System.out.println("f, " + f);
	}
}
