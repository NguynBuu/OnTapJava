package Test;

import java.util.Scanner;

import Class.PhanSo;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo ps1_104 = new PhanSo();
		PhanSo ps2_104 = new PhanSo();
		PhanSo psTong_104 = new PhanSo();
		
		// nhap phan so
		System.out.println("Nhap vao phan so thu nhat:");
		ps1_104.nhapPS(sc);
		System.out.println("Nhap vao phan so thu hai:");
		ps2_104.nhapPS(sc);
		
		// tinh tong 2 phan so
		psTong_104 = ps1_104.congPS(ps2_104);
		
		// hien thi phan so
		System.out.println("\nPhan so thu nhat la:");
		ps1_104.hienThiPS();
		System.out.println("\nPhan so thu hai la:");
		ps2_104.hienThiPS();
		System.out.println("\nPhan so tong la:");
		psTong_104.hienThiPS();
		
		sc.close();
	}

}