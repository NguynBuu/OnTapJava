package Testing;

import java.util.Scanner;

import Class.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc_104 = new Scanner(System.in);

		KhachSan ql_104 = new KhachSan();

		ql_104.nhapDanhSach(sc_104);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd_104 = sc_104.nextInt();

		System.out.println("==> Tong tien la: " + ql_104.tinhTien(cmnd_104));

		sc_104.close();
	}
}