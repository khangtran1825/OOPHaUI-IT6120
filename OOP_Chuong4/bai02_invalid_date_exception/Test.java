package bai02_invalid_date_exception;

public class Test {
	public static void main(String[] args) {
		try {
			ThoiGian tg = new ThoiGian(41, 12, 2005);
			System.out.println("Ngay hop le");
		} catch (InvalidDateException ide) {
			System.out.println("Loi: " + ide.getMessage());
		}
	}
}
