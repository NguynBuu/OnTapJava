package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop_104;
	private String khoHoc_104;
	private String kyHoc_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen_104 = hoTen;
		this.lop_104 = lop;
		this.khoHoc_104 = khoaHoc;
		this.kyHoc_104 = kyHoc;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop_104 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc_104 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc_104 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop_104);
		System.out.println("\tKhoa hoc: " + khoHoc_104);
		System.out.println("\tKy hoc: " + kyHoc_104);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop_104;
	}
}