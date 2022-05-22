package quanlymuonsach;

import java.util.Scanner;

public class Person {
	protected int maBanDoc;
private String hoTen ;
private String diaChi;
private String soDienThoai;



 Scanner scanner = new Scanner(System.in);
    public Person() {
    	super();
    }

	public int getMaBanDoc() {
			return maBanDoc;
		}

public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getSoDienThoai() {
	return soDienThoai;
}
public void setSoDienThoai(String soDienThoai) {
	
	this.soDienThoai = soDienThoai;
}   
		public void nhapThongTin() {
			 
               System.out.print("Nhập họ tên: ");
               this.setHoTen(scanner.nextLine());
               System.out.print("Nhập địa chỉ: ");
               this.setDiaChi(scanner.nextLine());
               System.out.print("Nhập số điện thoại: ");
               this.setSoDienThoai(scanner.nextLine());  
             
}
}