package Class;
import java.util.ArrayList;
import java.util.Scanner;
public class TuyenSinh {
	private ArrayList<ThiSinh> dsts_104;
	public TuyenSinh() {
		dsts_104 = new ArrayList<ThiSinh>(10);
	}
	public void themThiSinh(ThiSinh ts) {
		dsts_104.add(ts);
	}
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts_104;
		int chon_104;
		System.out.print("Nhap vao so luong thi sinh: ");
		int n_104 = sc.nextInt();
		sc.nextLine();
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon_104 = sc.nextInt();

			switch (chon_104) {
			case 1:ts_104 = new KhoiA("Toan", "Ly", "Hoa");break;case 2:ts_104 = new KhoiB("Toan", "Hoa", "Sinh");break;
			case 3:ts_104 = new KhoiC("Van", "Su", "Dia");break;default:ts_104 = new KhoiA("Toan", "Ly", "Hoa");break;
			}
			ts_104.nhapThongTin(sc);
			themThiSinh(ts_104);
		}
	}
	public void hienThiDanhSach() {
		int n_104 = dsts_104.size();
		for (int i_104 = 0; i_104 < n_104; i_104++) {
			System.out.println("Thi sinh thu " + (i_104 + 1) + " la:");
			dsts_104.get(i_104).hienThiThongTin();
		}
	}
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts_104 : dsts_104) {
			if (ts_104.getSoBD() == soBaoDanh) {
				ts_104.hienThiThongTin();
			}
		}
	}
}