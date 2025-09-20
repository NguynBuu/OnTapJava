package UseClass;

import java.util.Scanner;

import BuildClass.QuanLy;

public class Using {

	public static void main(String[] args) {
		Scanner sc_104 = new Scanner(System.in);

		QuanLy ql_104 = new QuanLy();
		ql_104.nhapDanhSach(sc_104);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql_104.hienThiDanhSach();

		sc_104.close();
	}

}