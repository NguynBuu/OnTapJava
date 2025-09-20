package Testing;

import java.util.Scanner;

import Class.TuyenSinh;

public class Test {

	public static void main(String[] args) {
		Scanner sc_104 = new Scanner(System.in);

		TuyenSinh dsTuyenSinh_104 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_104.nhapDanhSach(sc_104);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_104.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh_104 = sc_104.nextInt();
		sc_104.nextLine();

		dsTuyenSinh_104.timKiemThiSinh(soBaoDanh_104);

		sc_104.close();
	}

}