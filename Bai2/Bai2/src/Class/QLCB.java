package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb_104;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb_104 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb) {
		dscb_104.add(cb);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		CanBo cb_104;
		System.out.print("Nhap vao so luong can bo: ");
		int n_104 = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Lan nhap thu " + (i_104 + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon_104 = sc.nextInt();
			sc.nextLine();

			cb_104 = new CanBo();

			switch (chon_104) {
			case 1:
				cb_104 = new KySu();
				break;
			case 2:
				cb_104 = new NhanVien();
				break;
			case 3:
				cb_104 = new CongNhan();
				break;

			default:
				cb_104 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb_104.nhapThongTin(sc);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb_104);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb_104 : dscb_104) {
			if (hoTen.equals(cb_104.getHoTen())) {
				cb_104.hienThiThongTin();
			}
		}
	}
}