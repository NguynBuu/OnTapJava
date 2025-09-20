package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	// thuoc tinh
	private ArrayList<HocSinh> dshs_104;

	// phuong thuc
	// ham khoi tao
	public QLHS() {
		dshs_104 = new ArrayList<HocSinh>(10);
	}

	// ham them hoc sinh
	public void themHS(HocSinh hs) {
		dshs_104.add(hs);
	}

	// ham nhap danh sach
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs_104;

		System.out.print("Nhap vao so luong hoc sinh: ");
		int n_104 = sc.nextInt();
        sc.nextLine(); 
		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("\tHoc sinh thu " + (i_104 + 1) + " la:");

			hs_104 = new HocSinh();
			hs_104.nhapThongTin(sc);

			themHS(hs_104);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n_104 = dshs_104.size();
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("\tHoc sinh thu " + (i_104 + 1) + " la:");
			dshs_104.get(i_104).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin(int nam, String que) {
		for (HocSinh hs_104 : dshs_104) {
			if ((hs_104.getNgaySinh().getYear() + 1900 == nam) && (que.equals(hs_104.getQueQuan()))) {
				hs_104.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop) {
		for (HocSinh hs_104 : dshs_104) {
			if (lop.equals(hs_104.getLop())) {
				hs_104.hienThiThongTin();
			}
		}
	}
}