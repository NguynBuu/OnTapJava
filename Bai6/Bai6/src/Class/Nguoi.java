package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen_104;
	protected Date ngaySinh_104;
	protected int CMND_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, Date ngaySinh, int CMND) {
		this.hoTen_104 = hoTen;
		this.ngaySinh_104 = ngaySinh;
		this.CMND_104 = CMND;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_104 = sc.nextLine();
		ngaySinh_104 = strToDate(strDate_104);
		System.out.print("\tNhap CMND: ");
		CMND_104 = sc.nextInt();
	}

	private Date strToDate(String strDate) {
		Date date_104 = null;
		SimpleDateFormat sdf_104 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_104 = sdf_104.parse(strDate);
		} catch (ParseException e_104) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_104;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tCMND: " + CMND_104);
	}

	// ham lay ra thong tin CMND
	public int getCMND() {
		return CMND_104;
	}
}