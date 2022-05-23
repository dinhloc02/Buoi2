package logic;

import java.util.Scanner;

import main.Main;
import quanlymuonsach.BanDoc;
import quanlymuonsach.MuonSach;
import quanlymuonsach.QuanLyMuonSach;
import quanlymuonsach.Sach;

public class ListQuanLyMuonSach {
	public static void sapXep() {

		for (int i = 0; i < Main.QUANLYMUONSACH.length - 1; ++i) {
			if (Main.QUANLYMUONSACH[i] == null)
				continue;
			for (int j = i + 1; j < Main.QUANLYMUONSACH.length; ++j) {
				if (Main.QUANLYMUONSACH[j] == null)
					continue;
				if (Main.QUANLYMUONSACH[i].getBanDoc().getHoTen()
						.compareTo(Main.QUANLYMUONSACH[j].getBanDoc().getHoTen()) > 0) {
					QuanLyMuonSach temp = Main.QUANLYMUONSACH[i];
					Main.QUANLYMUONSACH[i] = Main.QUANLYMUONSACH[j];
					Main.QUANLYMUONSACH[j] = temp;
				}
			}
		}

	}

	public static void sapXepTheoSoLuong() {
		for (int i = 0; i < Main.QUANLYMUONSACH.length - 1; ++i) {
			if (Main.QUANLYMUONSACH[i] == null) {
				continue;
			}
			for (int j = i + 1; j < Main.QUANLYMUONSACH.length; ++j) {
				if (Main.QUANLYMUONSACH[j] == null) {
					continue;
				}
				if (Main.QUANLYMUONSACH[i].getSoLuongMuon()
						* Main.QUANLYMUONSACH[i].getMuonSach().length < Main.QUANLYMUONSACH[j].getSoLuongMuon()
								* Main.QUANLYMUONSACH[j].getMuonSach().length) {
					QuanLyMuonSach temp = Main.QUANLYMUONSACH[i];
					Main.QUANLYMUONSACH[i] = Main.QUANLYMUONSACH[j];
					Main.QUANLYMUONSACH[j] = temp;
				}
			}
		}
	}

	public static void searchBanDoc() {
		System.out.println("Nhập tên muốn tìm kiếm:");
		String ten = new Scanner(System.in).nextLine();
		for (int i = 0; i < Main.QUANLYMUONSACH.length; ++i) {
			if (Main.QUANLYMUONSACH[i] != null
					&& Main.QUANLYMUONSACH[i].getBanDoc().getHoTen().toUpperCase().contains(ten.toUpperCase()))
				System.out.println(Main.QUANLYMUONSACH[i]);
		}
	}

	public static void borrowSach() {
		if (Main.BANDOC.length <= 0 || Main.SACH.length <= 0) {
			System.out.println("Nhập sách với bạn đọc trước.");
			return;
		}
		System.out.println("Nhập vào số lượng bạn đọc muốn mượn");
		boolean check = true;
		int banDocMuonMuon = 0;
		do {
			try {
				banDocMuonMuon = new Scanner(System.in).nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("Kiểu nhập  không hợp lệ vui lòng nhập lại:");
				new Scanner(System.in).next();
			}

		} while (check);
		for (int i = 0; i < banDocMuonMuon; ++i) {
			BanDoc banDoc = nhapThongTinBanDoc(i);
			MuonSach[] muonSachh = nhapThongTinMuonSach();
			QuanLyMuonSach quanLyMuonSach = new QuanLyMuonSach(banDoc, muonSachh);
			saveBorrowSach(quanLyMuonSach);
		}

	}

	public static void saveBorrowSach(QuanLyMuonSach quanLyMuonSach) {
		for (int i = 0; i < Main.QUANLYMUONSACH.length; ++i) {
			if (Main.QUANLYMUONSACH[i] == null) {
				Main.QUANLYMUONSACH[i] = quanLyMuonSach;
				break;
			}

		}
	}

	public static void showBorrowSach() {
		for (int i = 0; i < Main.QUANLYMUONSACH.length; ++i) {
			if (Main.QUANLYMUONSACH[i] != null)
				System.out.println(Main.QUANLYMUONSACH[i]);
		}

	}

	public static MuonSach[] nhapThongTinMuonSach() {

		System.out.println("Nhập số lượng đầu sách muốn mượn:");
		int soLuong = 0;
		boolean check = true;
		do {
			try {
				soLuong = new Scanner(System.in).nextInt();
				check = false;
				if (soLuong < 1 || soLuong > 5) {
					System.out.println("Không được mượn quá 5 đầu sách nhập lại");
				}
			} catch (Exception e) {
				System.out.println("Kiểu dữ liệu không hợp lệ vui lòng nhập lại");
				new Scanner(System.in).next();
			}

		} while (check || soLuong < 1 || soLuong > 5);
		MuonSach[] muonSachh = new MuonSach[soLuong];
		for (int i = 0; i < soLuong; ++i) {
			System.out.println(" nhập mã đầu sách thứ  " + ++i + "  mà bạn đọc này muốn mượn");
			Sach sach = null;
			int maDauSach = 0;
			boolean checkss = true;
			do {
				do {
					try {
						maDauSach = new Scanner(System.in).nextInt();
						checkss = false;
					} catch (Exception e) {
						System.out.println("Không đúng kiểu dữ liệu vui lòng nhập lại:");
						new Scanner(System.in).next();
					}
				} while (checkss);

				for (int j = 0; j < Main.SACH.length; ++j)

					if (Main.SACH[j] != null && Main.SACH[j].getMaSach() == maDauSach) {
						sach = Main.SACH[j];
						break;
					}
				if (sach != null)
					break;
				System.out.println("không có mã đầu sách vui lòng nhập lại:");

			} while (true);
			System.out.println("Nhập số lượng muốn mượn:");
			int soLuongMuon = 0;
			boolean checks = true;
			do {
				try {
					soLuongMuon = new Scanner(System.in).nextInt();
					checks = false;
					if (soLuongMuon < 0 || soLuongMuon > 3) {
						System.out.println("không được mượn quá 3 cuốn vui lòng nhập lại:");
					}
				} catch (Exception e) {
					System.out.println("Kiểu dữ liệu không hợp lệ vui lòng nhập lại");
					new Scanner(System.in).next();
				}

			} while (checks || soLuongMuon < 0 || soLuongMuon > 3);
			MuonSach muonSachhh = new MuonSach(sach, soLuongMuon);
			for (int j = 0; j < muonSachh.length; ++j) {
				if (muonSachh[j] == null) {
					muonSachh[j] = muonSachhh;
					break;
				}
			}
		}
		return muonSachh;
	}

	public static BanDoc nhapThongTinBanDoc(int n) {
		System.out.println("Nhập id  của người thứ " + ++n);
		BanDoc banDoc = null;
		int idBanDoc = 0;
		boolean check = true;
		do {
			do {
				try {
					idBanDoc = new Scanner(System.in).nextInt();
					check = false;
				} catch (Exception e) {
					System.out.println("Không đúng kiểu dữ liệu nhập lại:");
					new Scanner(System.in).next();
				}

			} while (check);

			for (int i = 0; i < Main.BANDOC.length; ++i) {
				if (Main.BANDOC[i].getMaBanDoc() == idBanDoc && Main.BANDOC[i] != null) {

					banDoc = Main.BANDOC[i];
					break;

				}
			}
			if (banDoc != null) {
				break;
			}
			System.out.println("Không có mã bạn đọc ,nhập lại ");

		} while (true);

		return banDoc;
	}

}
