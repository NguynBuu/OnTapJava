package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi_104;
	private int soNha_104;
	private Nguoi[] list_104; // list la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list_104 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi_104 = soNguoi;
		this.soNha_104 = soNha;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_104 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i_104 = 0; i_104 < soNguoi_104; i_104++) {
			System.out.println("Nguoi thu " + (i_104 + 1) + " la:");
			list_104[i_104] = new Nguoi();
			list_104[i_104].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi_104);
		System.out.println("\tSo nha: " + soNha_104);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i_104 = 0; i_104 < soNguoi_104; i_104++) {
			System.out.println("Nguoi thu " + (i_104 + 1) + " la:");
			list_104[i_104].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list_104;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi_104;
	}
}