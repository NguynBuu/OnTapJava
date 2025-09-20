package Testing;

import java.util.Scanner;

import Class.QLHS;

public class Test {

	public static void main(String[] args) {
		Scanner sc_104=new Scanner(System.in);
		
		QLHS list_104=new QLHS();
		
		list_104.nhapDanhSachHS(sc_104);
		
		System.out.print("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
		list_104.timKiemThongTin(1985, "Thai Nguyen");
		
		System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
		list_104.timKiemThongTin("10A1");
		
		sc_104.close();
	}

}