package quanlymuonsach;

import java.util.Arrays;

public class QuanLyMuonSach extends MuonSach{

	private BanDoc banDoc;
	private MuonSach[] muonSach;

	public QuanLyMuonSach(BanDoc banDoc, MuonSach[] muonSach) {
		super();
		this.banDoc = banDoc;
		this.muonSach = muonSach;
	}

	public MuonSach[] getMuonSach() {
		return muonSach;
	}

	public void setMuonSach(MuonSach[] muonSach) {
		this.muonSach = muonSach;
	}

	public BanDoc getBanDoc() {
		return banDoc;
	}

	public void setBanDoc(BanDoc banDoc) {
		this.banDoc = banDoc;
	}

	@Override
	public String toString() {
		return "Quản lý mượn sách:  mượn sách (Sach=" + Arrays.toString(muonSach) + ", bạn đọc (" + banDoc + ")";
	}

}
