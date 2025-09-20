package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia_104;
	private int soTrang_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia_104 = tacGia;
		this.soTrang_104 = soTrang;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia_104 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_104 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia_104);
		System.out.println("\tSo trang: " + soTrang_104);
	}
}