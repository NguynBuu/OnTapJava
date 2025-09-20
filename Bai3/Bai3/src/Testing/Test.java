package Testing;

import java.util.Scanner;

import Class.QuanLySach;

public class Test {

	public static void main(String[] args) {
		Scanner sc_104 = new Scanner(System.in);

		QuanLySach qls_104 = new QuanLySach();

		qls_104.nhapDanhSachTL(sc_104);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai_104 = sc_104.nextLine();
		qls_104.timLoaiTL(loai_104);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL_104 = sc_104.nextLine();
		qls_104.timMaTL(maTL_104);

		sc_104.close();
	}
}