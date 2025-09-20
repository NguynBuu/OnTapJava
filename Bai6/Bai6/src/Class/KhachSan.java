package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds_104;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds_104 = new ArrayList<KhachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(KhachTro kt) {
		ds_104.add(kt);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach_104;

		System.out.print("Nhap vao so luong khach: ");
		int n_104 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Khach tro thu " + (i_104 + 1) + " la:");
			khach_104 = new KhachTro();
			khach_104.nhapThongTin(sc);
			themKhachTro(khach_104);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach_104 : ds_104) {
			khach_104.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND) {
		double tien_104 = 0;

		for (KhachTro khach_104 : ds_104) {
			if (khach_104.getCMND() == CMND) {
				tien_104 = khach_104.getSoNgayTro() * khach_104.getGiaPhong();
			}
		}

		return tien_104;
	}
}