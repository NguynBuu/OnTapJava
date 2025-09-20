package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen_104;
	protected String ngaySinh_104;
	protected String queQuan_104;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen_104 = hoTen;
		this.ngaySinh_104 = ngaySinh;
		this.queQuan_104 = queQuan;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_104 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan_104 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tQue quan: " + queQuan_104);
	}
}