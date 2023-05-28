package bai2HuongDoiTuong;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		danhSachSinhVien dssv = new danhSachSinhVien();
		
		int n = 0;
		
		do
		{
		   System.out.println("Vui lòng chọn chức năng: \n"
				               +"1. thêm sinh viên \n"
				               +"2. tính điểm trung bình từng sinh viên \n"
				               +"3. xếp loại từng sinh viên theo: giỏi >= 8, 6.5 <= khá < 8 , 5 <= trung bình < 6.5, yếu < 5 \n"
				               +"4. in ra sinh viên có điểm trung bình cao nhất \n"
				               +"5. in ra tất cả sinh viên yếu \n"
				               +"6. tìm sinh viên theo tên \n"
				               +"7. tìm 1 sinh viên theo mã \n"
				               +"8. xóa 1 sinh viên theo mã \n"
				               +"0. để thoát");
		   System.out.print("Nhập chức năng bạn chọn: ");
		   n = sc.nextInt();
		   sc.nextLine();
		   
		   System.out.println("---------------");
		   
		   if(n == 1)
		   {
			   dssv.nhapThongTinSV();
			   System.out.println("----------------");
		   } 
		   else if(n == 2)
		   {
			   dssv.DTBcuaSinhVien();
			   System.out.println("-----------------");
		   }
		   else if(n==3)
		   {
			   dssv.xeploaiSinhVien();
			   System.out.println("-----------------");
		   }
		   else if(n == 4)
		   {
			   if(dssv.DTBBangNhau() == false)
			   {
				   System.out.println("Các sinh viên đều bằng điểm nhau");
				   System.out.println("----------------");
				   continue;
			   }
			   dssv.DTBCaoNhat();
			   System.out.println("\n-----------------");
		   }
		   else if(n == 5)
		   {
			   dssv.SinhVienLoaiYeu();
			   System.out.println("\n----------------");
		   }
		   else if (n == 6)
		   {
			   dssv.timSinhVienTheoTen();
			   System.out.println("-------------------");
		   }
		   else if(n ==7)
		   {
			   dssv.timSinhVienTheoMa();
			   System.out.println("------------------");
		   }
		   else if(n == 8)
		   {
			   dssv.xoaSinhVienTheoMa();
			   System.out.println("------------------");
		   }
		   else {};
		   
		} while (n != 0);
		
		sc.close();
	}

}
