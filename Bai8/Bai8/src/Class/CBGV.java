package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung_104;
	private double thuong_104;
	private double phat_104;
	private double luongThucLinh_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung_104 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong_104 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat_104 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh_104 = luongCung_104 + thuong_104 - phat_104;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung_104);
		System.out.println("\tThuong: " + thuong_104);
		System.out.println("\tPhat: " + phat_104);
		System.out.println("\tLuong thuc linh: " + luongThucLinh_104);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh_104;
	}
}