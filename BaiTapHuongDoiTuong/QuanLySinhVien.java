package BaiTapHuongDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
	private ArrayList<SinhVien> danhSach;
	
	
		
	public QuanLySinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}
	
	
	
	public ArrayList<SinhVien> getDanhSach() {
		return danhSach;
	}



	public void setDanhSach(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}



	public void inPut()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name: ");
		String sN = sc.nextLine();
		System.out.println("Enter student code: ");
		String sC = sc.nextLine();
		System.out.println("Enter math mark: ");
		double mathMark = sc.nextDouble();
		if (mathMark < 0 || mathMark > 10)
		{
			System.out.println("Error!");
			return;
		}
		
		System.out.println("Enter physics mark: ");
		double physicsMark = sc.nextDouble();
		if (physicsMark < 0 || physicsMark > 10)
		{
			System.out.println("Error!");
			return;
		}
		
		System.out.println("Enter chemistry mark: ");
		double chemistryMark = sc.nextDouble();
		if (chemistryMark < 0 || chemistryMark > 10)
		{
			System.out.println("Error!");
			return;
		}
		
		SinhVien sv = new SinhVien(sN, sC, mathMark, physicsMark, chemistryMark);
		add(sv);
	}
	
	public void add(SinhVien sv)
	{
		this.danhSach.add(sv);
	}
	
	public void resultMediumMark()
	{
		for (int i = 0; i < danhSach.size(); i++) {
			danhSach.get(i).resultMediumMark();
		}
	}
	
	public void xepLoai()
	{
		for (int i = 0; i < danhSach.size(); i++) {
			
		double result =	danhSach.get(i).resultAverageMark();
		String name = danhSach.get(i).getName();
		
		if( result >= 9 )
		{
			System.out.println(name);
			System.out.println("excellent");
			System.out.println("----------");
		} 
		else if (result >= 8 && result < 9)
		{
			System.out.println(name);
			System.out.println("good");
			System.out.println("----------");
		}
		else if (result >= 7 && result < 8 )
		{
			System.out.println(name);
			System.out.println("rather");
			System.out.println("----------");
		}
		else if (result < 7 && result >= 6)
		{
			System.out.println(name);
			System.out.println("Medium");
			System.out.println("----------");
		}
		else if (result < 6 && result >=6)
		{
			System.out.println(name);
			System.out.println("week");
			System.out.println("----------");
		}
		else if (result < 5)
		{
			System.out.println(name);
			System.out.println("least");
			System.out.println("----------");
		}
		
		
		}
//		đề khúc sau chưa rõ nên em tự cho trường hợp yếu với kém.
	}
	
	
	

}
