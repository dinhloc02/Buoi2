package logic;

import java.util.Scanner;

import main.Main;
import quanlymuonsach.Sach;

public class ListSach {
public static void nhapSachMoi() {
	 Scanner scanner = new Scanner(System.in);
	  System.out.println("Nhập số sách muốn thêm:");
	  boolean check = true;
	  int soLuong=0;
	 do {
	try {
		 soLuong = new Scanner(System.in).nextInt();
		 check= false;
	} catch (Exception e) {
		     System.out.println("Không có kiểu dữ liệu nhập lại:");
		     scanner.next();    
	}
	
}while(check);
	for(int i =0;i<soLuong;++i) {
		Sach sach = new Sach();
		sach.nhapThongTin();
		saveSach(sach);
		showSach();
	}
}
	public static void saveSach(Sach sach) {
		for(int i=0;i< Main.SACH.length;++i)
		{
			if(Main.SACH[i]==null) {
				Main.SACH[i]= sach;
				return;
			}
				
		}
	}
	public static void showSach() {
		for(int i=0; i<Main.SACH.length;++i) {
			if(Main.SACH[i]==null) {
				continue;
			}
			System.out.println(Main.SACH[i]);
		}
	}
	

}
