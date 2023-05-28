package bai2HuongDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

public class danhSachSinhVien {
	private ArrayList<sinhVien> danhSach;
	
	public danhSachSinhVien() {
		this.danhSach = new ArrayList<sinhVien>(); // constructor rỗng
	}

	public danhSachSinhVien(ArrayList<sinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	public ArrayList<sinhVien> getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(ArrayList<sinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	
	public void nhapThongTinSV()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập tên sinh viên: ");
		String ten = sc.nextLine();
		System.out.println("Nhập mã sinh viên: ");
		String maSV = sc.nextLine();
		
		System.out.println("Nhập điểm toán: ");
		double diemToan = sc.nextDouble();
		if(diemToan < 0 || diemToan > 10)
		{
			System.out.println("Error!");
			return;
		}
		
		System.out.println("Nhập điểm lý: ");
		double diemLy = sc.nextDouble();
		if(diemLy < 0 || diemLy > 10)
		{
			System.out.println("Error!");
			return;
		}
		
		System.out.println("Nhập điểm hóa: ");
		double diemHoa = sc.nextDouble();
		if(diemHoa < 0 || diemHoa > 10)
		{
			System.out.println("Error!");
			return;
		}
		
		sinhVien sv = new sinhVien(ten,  maSV, diemToan, diemLy, diemHoa);
		themSinhVien(sv);
		System.out.println("--------------");
	}
	
	public void themSinhVien(sinhVien sv)
	{
		this.danhSach.add(sv);
	}
	
//	public void inSinhVien()
//	{
//		for (sinhVien sinhVien : danhSach) 
//		{
//			System.out.println(sinhVien);
//		}
//	}
	
//	tính điểm trung bình
	public void DTBcuaSinhVien()
	{
		for (sinhVien sinhVien : danhSach) 
		{
			System.out.println("Sinh Viên có tên: " + sinhVien.getTen() + " - Có điểm trung bình = " + sinhVien.diemTrungBinh() );
		}
	}
	
//	xếp loại học lực sinh viên
	public void xeploaiSinhVien()
	{
		for (sinhVien sinhVien : danhSach) 
		{
			double tong = sinhVien.diemTrungBinh();
			if (tong >= 8)
			{
				System.out.println( "Sinh viên: "+ sinhVien.getTen() + " đạt loại giỏi ");
			}
			else if (tong >= 6.5 && tong < 8 )
			{
				System.out.println( "Sinh viên: "+ sinhVien.getTen() + " đạt loại khá ");
			}
			else if (tong >= 5 && tong < 6.5)
			{
				System.out.println( "Sinh viên: "+ sinhVien.getTen() + " đạt loại trung bình ");
			}
			else if(tong < 5)
			{
				System.out.println( "Sinh viên: "+ sinhVien.getTen() + " đạt loại yếu ");
			}
			
		}
	}
//	sinh viên có điểm trung bình cao nhất
	public boolean DTBBangNhau()
	{
		
	    boolean ketQua = false;
		double dtb = danhSach.get(0).diemTrungBinh();
		
		for (int i = 1; i < danhSach.size(); i++)
		{
			if (dtb != danhSach.get(i).diemTrungBinh())
			{
				ketQua = true;
				break;
			}
		}
		return ketQua;
		
	}
	
	
	public void DTBCaoNhat()
	{
		
		
		double dtb = danhSach.get(0).diemTrungBinh();
		String name = danhSach.get(0).getTen();
		int j = 0;
		
		System.out.print("Sinh viên có điểm trung bình cao nhất: ");
		
		for (int i = 0; i < danhSach.size(); i++) 
		{
			if(dtb < danhSach.get(i).diemTrungBinh())
			{
				dtb = danhSach.get(i).diemTrungBinh();
				name = danhSach.get(i).getTen();
			}
		}
			
		for (int i = 0; i < danhSach.size(); i++) {
			if(dtb == danhSach.get(i).diemTrungBinh())
			{
				name = danhSach.get(i).getTen();
				System.out.print(name + " ");
			}
		}
		
	}
	
//	in ra các sinh viên loại yếu
	public void SinhVienLoaiYeu()
	{
		boolean KhongCoLoaiYeu = true;
		System.out.println("Sinh viên xếp loại yếu: ");
		for( int i = 0; i < danhSach.size(); i++ )
		{
			if(danhSach.get(i).diemTrungBinh() < 5)
			{
				System.out.print( danhSach.get(i).getTen() + " ");
				KhongCoLoaiYeu = false;
			}
		}
		
		if(KhongCoLoaiYeu == true)
		{
			System.out.println("Danh sách không có sinh viên loại yếu.");
		}
		
	}
	
//	tìm sinh viên theo tên
	public void timSinhVienTheoTen()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tìm sinh viên theo tên: ");
		String ten = sc.nextLine();
		
		for (sinhVien sinhVien : danhSach) {
			
			if(sinhVien.getTen().equals(ten))
			{
				System.out.println(sinhVien);
				return;
			}
		}
		
		System.out.println("Không tìm thấy tên trong danh sách!");
		
	}
	
//	tìm 1 sinh viên theo mã
	public void timSinhVienTheoMa()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tìm sinh viên theo mã sinh viên: ");
		String masv = sc.nextLine();
		
		for (sinhVien sinhVien : danhSach) {
			
			if(sinhVien.getMaSV().equals(masv))
			{
				System.out.println(sinhVien);
				return;
			}
		}
		
		System.out.println("Không tìm thấy tên trong danh sách!");
	}
	
//	Xóa 1 sinh viên theo mã
	public void xoaSinhVienTheoMa()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập mã sinh viên bạn muốn xóa ra khỏi danh sách: ");
		String masv = sc.nextLine();
		
		for (int i = 0; i < danhSach.size(); i++) 
		{
			if(danhSach.get(i).getMaSV().equals(masv))
			{
				danhSach.remove(i);
				return;
			}
		}
		System.out.println("Mã sinh viên không có trong danh sách!");
	}
	
	
	
	
	

}
