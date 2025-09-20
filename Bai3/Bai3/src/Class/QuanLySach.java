package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl_104;
	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl_104 = new ArrayList<TaiLieu>(10);
	}
	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl) {
		dstl_104.add(tl);
	}
	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc) {
		int chon_104;
		String stop_104;
		TaiLieu tl_104;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon_104 = sc.nextInt();
			sc.nextLine();

			switch (chon_104) {
			case 1:
				tl_104 = new Sach();
				break;
			case 2:
				tl_104 = new TapChi();
				break;
			case 3:
				tl_104 = new Bao();
				break;

			default:
				tl_104 = new Sach();
				break;
			}

			tl_104.nhapThongTin(sc);
			themTaiLieu(tl_104);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop_104 = sc.nextLine();
		} while (stop_104.equals("c"));
	}
	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL) {
		for (TaiLieu tl_104 : dstl_104) {
			if (maTL.equals(tl_104.getMaTaiLieu())) {
				tl_104.hienThiThongTin();
			}
		}
	}
	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai) {
		for (TaiLieu tl_104 : dstl_104) {
			if (loai.equals("Sach") && (tl_104 instanceof Sach)) {
				tl_104.hienThiThongTin();
			} else if (loai.equals("TapChi") && (tl_104 instanceof TapChi)) {
				tl_104.hienThiThongTin();
			} else if (loai.equals("Bao") && (tl_104 instanceof Bao)) {
				tl_104.hienThiThongTin();
			}
		}
	}
}