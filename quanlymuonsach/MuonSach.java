package quanlymuonsach;

import java.util.Scanner;

public class MuonSach {
	private Sach sach;
	private int soLuongMuon;

	public MuonSach(Sach sach, int soLuongMuon) {
		this.sach = sach;
		this.soLuongMuon = soLuongMuon;
	}

	public MuonSach() {

	}

	public Sach getSach() {
		return sach;
	}

	public void setSach(Sach sach) {
		this.sach = sach;
	}

	public int getSoLuongMuon() {
		return soLuongMuon;
	}

	public void setSoLuongMuon(int soLuongMuon) {
		this.soLuongMuon = soLuongMuon;
	}

	@Override
	public String toString() {
		return sach + ", số lượng mượn:" + soLuongMuon + " ";
	}

}
