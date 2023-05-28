package BaiTapHuongDoiTuong;

import java.util.Scanner;

public class testBai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLySinhVien qlsv = new QuanLySinhVien();
		int n = 0;
		
		do {
			
			System.out.println("Các chức năng: "
					           + "\n1. nhập và thêm sinh viên"
					           + "\n2. tính điểm trung bình từng sinh viên"
					           + "\n3. xếp loại từng sinh viên");
		System.out.println("Chọn chức năng: ");
		n = sc.nextInt();
		sc.nextLine();
		
		if(n == 1)
		{
			qlsv.inPut();
		} 
		else if (n == 2)
		{
			qlsv.resultMediumMark();
		}
		else if(n == 3)
		{
			qlsv.xepLoai();
		}
		
		
		} while (n != 0);
		
	
	}

}
