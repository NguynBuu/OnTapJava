package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<TheMuon> ds_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public QuanLy() {
		ds_104 = new ArrayList<TheMuon>(10);
	}

	// ham them the muon vao danh sach
	public void themTheMuon(TheMuon theMuon) {
		ds_104.add(theMuon);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon_104;

		System.out.print("Nhap vao so luong the muon: ");
		int n_104 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("The muon thu " + (i_104 + 1) + " la:");
			theMuon_104 = new TheMuon();
			theMuon_104.nhapThongTin(sc);
			themTheMuon(theMuon_104);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the_104 : ds_104) {
			if (the_104.getHanTra().getDate() == 31 || the_104.getHanTra().getDate() == 30) {
				the_104.hienThiThongTin();
			}
		}
	}
}