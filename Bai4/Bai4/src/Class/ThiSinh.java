package Class;
import java.util.Scanner;
public class ThiSinh {
	// thuoc tinh
	private int soBD_104;
	private String hoTen_104;
	private String diaChi_104;
	private String dienUuTien_104;
	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}
	// ham khoi tao co doi so
	public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD_104 = soBD;
		this.hoTen_104 = hoTen;
		this.diaChi_104 = diaChi;
		this.dienUuTien_104 = dienUuTien;
	}
	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD_104 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_104 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_104 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien_104 = sc.nextLine();
	}
	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD_104);
		System.out.println("\tHo ten: " + hoTen_104);
		System.out.println("\tDia chi: " + diaChi_104);
		System.out.println("\tDien uu tien: " + dienUuTien_104);
	}
	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD_104;
	}
}