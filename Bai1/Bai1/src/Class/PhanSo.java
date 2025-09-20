package Class;

import java.util.Scanner;

public class PhanSo {
	// thuoc tinh
	private int tuSo_104;
	private int mauSo_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public PhanSo() {
		tuSo_104 = 0;
		mauSo_104 = 1;
	}

	// ham khoi tao co doi so
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo_104 = tuSo;
		this.mauSo_104 = mauSo;
	}

	// ham nhap phan so
	public void nhapPS(Scanner sc) {
		int a_104;
		int b_104;

		do {
			System.out.print("\tNhap vao tu so: ");
			a_104 = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b_104 = sc.nextInt();

			// kiem tra
			if (b_104 == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo_104 = a_104;
				mauSo_104 = b_104;
			}
		} while (b_104 == 0);
	}

	// ham hien thi
	public void hienThiPS() {
		if (tuSo_104 * mauSo_104 < 0) {
			System.out.println("\t-" + Math.abs(tuSo_104) + "/" + Math.abs(mauSo_104));
		} else {
			System.out.println("\t" + Math.abs(tuSo_104) + "/" + Math.abs(mauSo_104));
		}
	}

	// ham cong
	public PhanSo congPS(PhanSo ps2) {
		int a_104 = tuSo_104 * ps2.mauSo_104 + ps2.tuSo_104 * mauSo_104;
		int b_104 = mauSo_104 * ps2.mauSo_104;

		return new PhanSo(a_104, b_104);
	}

	// ham tru
	public PhanSo truPS(PhanSo ps2) {
		int a_104 = tuSo_104 * ps2.mauSo_104 - ps2.tuSo_104 * mauSo_104;
		int b_104 = mauSo_104 * ps2.mauSo_104;

		return new PhanSo(a_104, b_104);
	}

	// ham nhan
	public PhanSo nhanPS(PhanSo ps2) {
		int a_104 = tuSo_104 * ps2.tuSo_104;
		int b_104 = mauSo_104 * ps2.mauSo_104;

		return new PhanSo(a_104, b_104);
	}

	// ham chia
	public PhanSo chiaPS(PhanSo ps2) {
		int a_104 = tuSo_104 * ps2.mauSo_104;
		int b_104 = mauSo_104 * ps2.tuSo_104;

		return new PhanSo(a_104, b_104);
	}

	// ham tim uscln
	private int timUSCLN(int a, int b) {
		int r_104 = a % b;

		while (r_104 != 0) {
			a = b;
			b = r_104;
			r_104 = a % b;
		}

		return b;
	}

	// ham kiem tra phan so toi gian hay chua
	public boolean kiemTraToiGian() {
		if (timUSCLN(Math.abs(tuSo_104), Math.abs(mauSo_104)) == 1) {
			return true;
		}
		return false;
	}

	// ham toi gian
	public void toiGianPS() {
		int x_104 = timUSCLN(Math.abs(tuSo_104), Math.abs(mauSo_104));

		tuSo_104 /= x_104;
		mauSo_104 /= x_104;
	}
}