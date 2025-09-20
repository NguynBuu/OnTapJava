package Testing;

import java.util.Scanner;

import Class.QLCB;

public class Test {

	public static void main(String[] args) {
		Scanner sc_104 = new Scanner(System.in);

		QLCB qlcb_104 = new QLCB();

		qlcb_104.nhapDanhSach(sc_104);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name_104 = sc_104.nextLine();

		qlcb_104.timKiemCanBo(name_104);

		// huy sc
		sc_104.close();
	}

}