package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen_104;
	protected String maSV_104;
	protected String ngaySinh_104;
	protected String lop_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen_104 = hoTen;
		this.maSV_104 = maSV;
		this.ngaySinh_104 = ngaySinh;
		this.lop_104 = lop;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV_104 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_104 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop_104 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tMa sinh vien: " + maSV_104);
		System.out.println("\tLop: " + lop_104);
	}
}