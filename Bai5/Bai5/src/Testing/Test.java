package Testing;

import java.util.Scanner;

import Class.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc_104 = new Scanner(System.in);

		KhuPho qlkp_104 = new KhuPho();

		qlkp_104.nhapDanhSach(sc_104);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_104.timKiemThongTin();
	}

}