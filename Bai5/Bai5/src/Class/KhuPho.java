package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd_104;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd_104 = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan) {
		dshd_104.add(hoDan);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc) {
		HoDan hoDan_104;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan_104 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i_104 = 0; i_104 < soHoDan_104; i_104++) {
			System.out.println("Ho dan thu " + (i_104 + 1) + " la:");
			hoDan_104 = new HoDan();
			hoDan_104.nhapThongTin(sc);
			themHoDan(hoDan_104);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n_104 = dshd_104.size();

		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Ho dan thu " + (i_104 + 1) + " la:");
			dshd_104.get(i_104).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now_104 = new Date();
		int namHienTai_104 = now_104.getYear() + 1900;

		Nguoi[] dstv_104 = null;

		for (HoDan hoDan_104 : dshd_104) {
			dstv_104 = hoDan_104.getList();
			for (int i_104 = 0; i_104 < hoDan_104.getSoNguoi(); i_104++) {
				if (namHienTai_104 - (dstv_104[i_104].getNgaySinh().getYear() + 1900) == 80) {
					hoDan_104.hienThiThongTin();
				}
			}
		}
	}
}