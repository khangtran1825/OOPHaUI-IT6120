package bai11_giangvien;

import java.util.Scanner;

public class Test {
	public static void hienThongTin(GVCoHuu myArray[], int n) {
		System.out.println("\nDanh sach giang vien: ");
		System.out.println("Ho ten \t Dia chi       Loai GV   Luong    \t LuongCB \t HSL  NamCT");
		for (int i = 0; i < n; i++) {
			myArray[i].inThongTin();
		}
	}

	public static GVCoHuu[] addX(GVCoHuu myArray[], GVCoHuu x) {
		GVCoHuu[] newArray = new GVCoHuu[myArray.length + 1];

		for (int i = 0; i < myArray.length; i++)
			newArray[i] = myArray[i];

		newArray[myArray.length] = x;
		return newArray;
	}

	public static GVCoHuu[] removeX(GVCoHuu myArray[], int viTri) {
		GVCoHuu[] newArray = new GVCoHuu[myArray.length - 1];

		for (int i = 0, k = 0; i < myArray.length; i++) {
			if (i == viTri)
				continue;
			newArray[k++] = myArray[i];
		}

		return newArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GVCoHuu dsgv[] = new GVCoHuu[7];

		dsgv[0] = new GVCoHuu(1300000, 2, 5, "Tran Z", "Ha Noi 5", "Co Huu");
		dsgv[1] = new GVCoHuu(1800000, 1.8, 10, "Tran C", "Ha Noi 2", "Co Huu");
		dsgv[2] = new GVCoHuu(1400000, 1.2, 9, "Tran N", "Ha Noi 7", "Co Huu");
		dsgv[3] = new GVCoHuu(1000000, 2, 2, "Tran H", "Ha Noi 4", "Co Huu");
		dsgv[4] = new GVCoHuu(2700000, 1.6, 6, "Tran E", "Ha Noi 6", "Co Huu");
		dsgv[5] = new GVCoHuu(2000000, 2.2, 12, "Tran A", "Ha Noi 1", "Co Huu");
		dsgv[6] = new GVCoHuu(1250000, 1.4, 3, "Tran B", "Ha Noi 3", "Co Huu");

		// Sap xep theo thu tu nam cong tac
		System.out.println("\nDanh sach truoc sap xep: ");
		hienThongTin(dsgv, 7);

		for (int i = 0; i < 7; i++) {
			for (int j = i + 1; j < 7; j++) {
				if (dsgv[i].getNamCongTac() < dsgv[j].getNamCongTac()) {
					GVCoHuu temp = dsgv[i];
					dsgv[i] = dsgv[j];
					dsgv[j] = temp;
				}
			}
		}

		System.out.println("\nDanh sach sau sap xep: ");
		hienThongTin(dsgv, 7);

		// Them giang vien
		GVCoHuu x = new GVCoHuu(1100000, 1.3, 12, "Tran K", "Ha Noi 11", "Co Huu");
		dsgv = addX(dsgv, x);
		hienThongTin(dsgv, 8);

		// Xoa giang vien
		dsgv = removeX(dsgv, 7);
		hienThongTin(dsgv, 7);
		sc.close();

		// Tim kiem giang vien ten "Tran Z"
		System.out.println("\nThong tin cua giang vien ten Z la: ");
		for (int i = 0; i < dsgv.length; i++) {
			if (dsgv[i].getHoTen().equals("Tran Z")) {
				dsgv[i].inThongTin();
			}
		}
	}
}
