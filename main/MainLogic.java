package main;

import java.util.Scanner;

import logic.ListBanDoc;
import logic.ListQuanLyMuonSach;
import logic.ListSach;

public class MainLogic {
	public static void menu() {
		System.out.println("\n\n\n------------PHẦN MỀM QUẢN LÝ MƯỢN SÁCH THƯ VIỆN--------------");
		System.out.println("1. Nhập đầu sách mới.");
		System.out.println("2. In ra danh sách sách trong thư viện.");
		System.out.println("3. Nhập bạn đọc mới.");
		System.out.println("4. In ra danh sách bạn đọc trong thư viện.");
		System.out.println("5. Cho mượn sách.");
		System.out.println("6. Sắp xếp danh sách mượn sách theo tên.");
		System.out.println("7. Sắp xếp danh sách mượn sách theo sách mượn.");
		System.out.println("8. Tìm kiếm trong danh sách mượn sách theo tên bạn đọc.");
		System.out.println("9. Thoát chương trình.\n\n");

		boolean out = true;
		boolean check = true;
		int chucNang = 0;

		do {
			System.out.println("Chọn chức năng:");
			do {
				try {
					chucNang = new Scanner(System.in).nextInt();
					check = false;
					if (chucNang < 1 || chucNang > 9) {
						System.out.println("Chọn chức năng không hợp lệ vui lòng chọn lại:");
					}
				} catch (Exception e) {
					System.out.println("Chọn chức năng không hợp lệ vui lòng chọn lại:");
					new Scanner(System.in).next();
				}
			} while (check || chucNang < 1 || chucNang > 9);
			switch (chucNang) {

			case 1:
				ListSach.nhapSachMoi();
				break;
			case 2:
				ListSach.showSach();
				break;
			case 3:
				ListBanDoc.nhapBanDocMoi();
				break;
			case 4:
				ListBanDoc.showBanDoc();
				break;
			case 5:
				ListQuanLyMuonSach.borrowSach();
				ListQuanLyMuonSach.showBorrowSach();
				break;
			case 6:
				ListQuanLyMuonSach.sapXep();
				ListQuanLyMuonSach.showBorrowSach();
				break;
			case 7:
				ListQuanLyMuonSach.sapXepTheoSoLuong();
				ListQuanLyMuonSach.showBorrowSach();
				break;
			case 8:
				ListQuanLyMuonSach.searchBanDoc();
				break;
			case 9:
				out = false;

			}
		} while (out);
	}
}
