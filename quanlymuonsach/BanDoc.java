package quanlymuonsach;

import java.util.Scanner;

import hangso.TypeBanDoc;

public class BanDoc extends Person {
	private static int iD = 10000;
	private TypeBanDoc typeBanDoc;

	public TypeBanDoc getTypeBanDoc() {
		return typeBanDoc;
	}

	public void setTypeBanDoc(TypeBanDoc typeBanDoc) {
		this.typeBanDoc = typeBanDoc;
	}

	Scanner scanner = new Scanner(System.in);

	public void nhapThongTin() {
		super.nhapThongTin();
		this.maBanDoc = BanDoc.iD++;
		nhapThongTinType();
		System.out.println("Mã bạn đọc:" + this.getMaBanDoc());

	}

	public void nhapThongTinType() {
		System.out.println("Nhập loại bạn đọc ( 1: sinh viên , 2: học viên cao học ,3 : giáo viên)");
		int loaiBanDoc = 0;
		boolean check = true;
		do {
			try {
				loaiBanDoc = scanner.nextInt();
				check = false;
				if (loaiBanDoc < 1 || loaiBanDoc > 3) {
					System.out.println("Không có kiểu dữ liệu nhập lại:");
				}
			} catch (Exception e) {

				System.out.println("không có kiểu giữ liệu nhập lại:");
				scanner.next();
			}
		} while (check || loaiBanDoc <= 0 || loaiBanDoc > 3);

		switch (loaiBanDoc) {
		case 1:
			this.setTypeBanDoc(TypeBanDoc.Sinh_Viên);
			break;
		case 2:
			this.setTypeBanDoc(typeBanDoc.Học_viên_cao_học);
			break;
		case 3:
			this.setTypeBanDoc(typeBanDoc.Giáo_viên);
			break;

		}

	}

	@Override
	public String toString() {
		return "Loại bạn đọc:" + typeBanDoc + ", mã bạn đọc" + getMaBanDoc() + ", họ tên:" + getHoTen() + ", địa chỉ:"
				+ getDiaChi() + ", số điện thoại :" + getSoDienThoai();
	}
}
