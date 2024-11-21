package bai07_resizablecircle;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ResizableCircle rc = new ResizableCircle();

		System.out.print("Nhap ban kinh hinh tron: ");
		double r = sc.nextDouble();
		rc.setRadius(r);
		System.out.println("Chu vi va dien tich hinh tron: " + rc.getPerimeter() + ", " + rc.getArea());

		System.out.print("Nhap % hinh tron moi: ");
		int percent = sc.nextInt();
		rc.resize(percent);
		System.out.println("Chu vi va dien tich hinh tron: " + rc.getPerimeter() + ", " + rc.getArea());

		sc.close();
	}
}
