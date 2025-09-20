package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi_104;
	private int chiSoCu_104;
	private double tien_104;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi_104 = chiSoMoi;
		this.chiSoCu_104 = chiSoCu;
		this.tien_104 = tien;
	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo_104 = tenChuHo;
		this.chiSoMoi_104 = chiSoMoi;
		this.chiSoCu_104 = chiSoCu;
		this.tien_104 = tien;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu_104 = sc.nextInt();
		sc.nextLine();
		tien_104 = (chiSoMoi_104 - chiSoCu_104) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_104);
		System.out.println("\tChi so cu: " + chiSoCu_104);
		System.out.println("\tTien: : " + tien_104);
	}
}