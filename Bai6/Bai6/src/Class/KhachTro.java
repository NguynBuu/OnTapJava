package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro_104;
	private String loaiPhong_104;
	private double giaPhong_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen_104 = hoTen;
		this.CMND_104 = CMND;
		this.soNgayTro_104 = soNgayTro;
		this.loaiPhong_104 = loaiPhong;
		this.giaPhong_104 = giaPhong;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong_104 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong_104 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro_104);
		System.out.println("\tLoai phong: " + loaiPhong_104);
		System.out.println("\tGia phong: " + giaPhong_104);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro_104;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong_104;
	}
}