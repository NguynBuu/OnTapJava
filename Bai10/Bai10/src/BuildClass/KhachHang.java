package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo_104;
	protected int soNha_104;
	protected String maCongTo_104;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo_104 = tenChuHo;
		this.soNha_104 = soNha;
		this.maCongTo_104 = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo_104 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo_104 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo_104);
		System.out.println("\tSo nha: " + soNha_104);
		System.out.println("\tMa cong to: " + maCongTo_104);
	}
}