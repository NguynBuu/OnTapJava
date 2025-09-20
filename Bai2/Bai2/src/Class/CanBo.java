package Class;

import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen_104;
	private String ngaySinh_104;
	private String gioiTinh_104;
	private String diaChi_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen_104 = hoTen;
		this.ngaySinh_104 = ngaySinh;
		this.gioiTinh_104 = gioiTinh;
		this.diaChi_104 = diaChi;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh_104 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh_104 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_104 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tNgay sinh: " + ngaySinh_104);
		System.out.println("\tGioi tinh: " + gioiTinh_104);
		System.out.println("\tDia chi: " + diaChi_104);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen_104;
	}
}