package logic;

import java.util.Scanner;

import main.Main;
import quanlymuonsach.BanDoc;

public class ListBanDoc {
	public static void nhapBanDocMoi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số bạn đọc muốn thêm:");
		boolean check = true;
		int soLuong = 0;
		do {
			try {
				soLuong = new Scanner(System.in).nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("Không có kiểu dữ liệu nhập lại:");
				scanner.next();
			}

		} while (check);
		for (int i = 0; i < soLuong; ++i) {
			BanDoc banDoc = new BanDoc();
			banDoc.nhapThongTin();
			saveBanDocMoi(banDoc);
			showBanDoc();

		}
	}

	public static void saveBanDocMoi(BanDoc banDoc) {
		for (int i = 0; i <= Main.BANDOC.length; ++i) {
			if (Main.BANDOC[i] == null) {
				Main.BANDOC[i] = banDoc;
				return;
			}
		}
	}

	public static void showBanDoc() {
		for (int i = 0; i < Main.BANDOC.length; ++i) {
			if (Main.BANDOC[i] != null)
				System.out.println(Main.BANDOC[i]);
		}
	}

}
