package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<CBGV> ds_104;

	// phuong thuc
	// ham khoi tao
	public QuanLy() {
		ds_104 = new ArrayList<CBGV>(10);
	}

	// ham them can bo vao danh sach
	public void themCBGV(CBGV canBo) {
		ds_104.add(canBo);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo_104;

		System.out.print("Nhap vao so luong can bo: ");
		int n_104 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Can bo thu " + (i_104 + 1) + " la:");
			canBo_104 = new CBGV();
			canBo_104.nhapThongTin(sc);
			themCBGV(canBo_104);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cb_104 : ds_104) {
			cb_104.hienThiThongTin();
		}
	}

	// ham tim kiem
	public void timKiem(double luong) {
		for (CBGV cb_104 : ds_104) {
			if (cb_104.getLuongThucLinh() >= luong) {
				cb_104.hienThiThongTin();
			}
		}
	}
}