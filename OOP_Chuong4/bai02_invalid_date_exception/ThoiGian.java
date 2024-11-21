package bai02_invalid_date_exception;

public class ThoiGian {
	// Object's Properties
	protected int ngay;
	protected int thang;
	protected int nam;

	// Constructor Methods
	public ThoiGian() {
	}

	public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
		if (ngay < 0 || thang < 0 || nam < 0)
			throw new InvalidDateException("Ngay, thang, nam khong the am");
		if (thang > 12)
			throw new InvalidDateException("Thang khong the lon hon 12");
		if (ngay > 31)
			throw new InvalidDateException("Ngay khong the lon hon 31");
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

}
