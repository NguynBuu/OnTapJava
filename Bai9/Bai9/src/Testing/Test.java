package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc_104 = new Scanner(System.in);

		QuanLy ql_104 = new QuanLy();

		ql_104.nhapDanhSach(sc_104);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql_104.hienThiDanhSachTraCuoiThang();

		sc_104.close();
	}
}