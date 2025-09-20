package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon_104;
	private Date ngayMuon_104;
	private Date hanTra_104;
	private String soHieu_104;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soMuon_104 = soMuon;
		this.ngayMuon_104 = ngayMuon;
		this.soHieu_104 = soHieu;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon_104 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon_104 = sc.nextLine();
		ngayMuon_104 = strToDate(strNgayMuon_104);

		String strNgayTra_104 = "31-12-2020";
		hanTra_104 = strToDate(strNgayTra_104);

		System.out.println("\tNhap so hieu: ");
		soHieu_104 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date_104 = null;

		SimpleDateFormat sdf_104 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_104 = sdf_104.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_104;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon_104);
		System.out.println("\tNgay muon: " + ngayMuon_104);
		System.out.println("\tHan tra: " + hanTra_104);
		System.out.println("\tSo hieu: " + soHieu_104);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra_104;
	}
}