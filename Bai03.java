package chuong2;

public class Bai03 {
	public static void main(String[] args) {
		int a = 100;
		int b = 100;

		System.out.println("a, " + (a | b));
		System.out.println("b, " + (a & b));
		System.out.println("c, " + (a ^ b));
		System.out.println("d, " + (~a));
		System.out.println("e, " + (a >> 2));
		System.out.println("f, " + (b << 2));
	}
}
