package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu_104;
	private String tenNXB_104;
	private int soBanPhatHanh_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu_104 = maTaiLieu;
		this.tenNXB_104 = tenNXB;
		this.soBanPhatHanh_104 = soBanPhatHanh;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_104 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_104 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_104 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_104);
		System.out.println("\tTen nha xuat ban: " + tenNXB_104);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_104);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu_104;
	}
}