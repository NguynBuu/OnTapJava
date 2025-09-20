package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	private String hoTen_104;
	private Date ngaySinh_104;
	private String ngheNghiep_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, Date ngaySinh, String ngheNghiep) {
		this.hoTen_104 = hoTen;
		this.ngaySinh_104 = ngaySinh;
		this.ngheNghiep_104 = ngheNghiep;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_104 = sc.nextLine();
		ngaySinh_104 = strToDate(strDate_104);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep_104 = sc.nextLine();
	}

	// ham thuc hien chuyen string sang date
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

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh_104));
		System.out.println("\tNghe nghiep: " + ngheNghiep_104);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date) {
		SimpleDateFormat sdf_104 = new SimpleDateFormat("dd-MM-yyyy");

		String strDate_104 = sdf_104.format(date);

		return strDate_104;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh_104;
	}
}