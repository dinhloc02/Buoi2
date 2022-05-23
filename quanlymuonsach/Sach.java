package quanlymuonsach;

import java.util.Scanner;

import hangso.TypeSach;

public class Sach {
	private String tacGia, tenSach, namXuatBan;
	private static int iD = 10000;
	private int maSach;
	TypeSach typeSach;

	Scanner scanner = new Scanner(System.in);

	public TypeSach getTypeSach() {
		return typeSach;
	}

	public void setTypeSach(TypeSach typeSach) {
		this.typeSach = typeSach;
	}

	public int getMaSach() {
		return maSach;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(String namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public void nhapThongTin() {

		this.maSach = Sach.iD++;
		System.out.println("Mã sách: " + this.getMaSach());
		System.out.print("Nhập tên tác giả: ");
		this.setTacGia(scanner.nextLine());
		System.out.print("Nhập tên sách: ");
		this.setTenSach(scanner.nextLine());
		System.out.print("Nhập năm xuất bản:");
		this.setNamXuatBan(scanner.nextLine());
		System.out.print("Nhập chuyên ngành(1 :Khoa học tự nhiên,2:Văn học – Nghệ thuật,Điện tử Viễn thông\r\n"
				+ ",4:Công nghệ thông tin ): ");
		int chuyenNganh = 0;
		boolean check = true;
		do {
			try {
				chuyenNganh = scanner.nextInt();
				check = false;
				if (chuyenNganh < 1 || chuyenNganh > 4) {
					System.out.println("Không có kiểu dữ liệu nhập lại:");
				}
			} catch (Exception e) {
				System.out.println("không có kiểu dữ liệu, nhập lại:");
				scanner.next();
			}
		} while (check || chuyenNganh < 1 || chuyenNganh > 4);
		switch (chuyenNganh) {
		case 1:
			this.setTypeSach(typeSach.Khoa_học_tự_nhiên);
		case 2:
			this.setTypeSach(typeSach.Văn_học_nghệ_thuật);
		case 3:
			this.setTypeSach(typeSach.Điện_tử_viễn_thông);
		case 4:
			this.setTypeSach(typeSach.Công_nghệ_thông_tin);
		}

	}

	@Override
	public String toString() {
		return "Tác giả:" + tacGia + ", tên sách:" + tenSach + ", năm xuất bản:" + namXuatBan + ", mã sách:" + maSach
				+ ", loại sách:" + typeSach + "]";
	}
}
