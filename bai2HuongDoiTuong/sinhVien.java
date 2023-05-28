package bai2HuongDoiTuong;

public class sinhVien {
	private String ten;
	private String maSV;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public sinhVien()
	{
		
	}
	
	public sinhVien(String ten, String maSV, double diemToan, double diemLy, double diemHoa) {
		this.ten = ten;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	public double diemTrungBinh()
	{
		return (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}
	
	@Override
	public String toString() {
		return "sinhVien [ ten = " + ten + ", maSV = " + maSV + ", diemToan = " + diemToan + ", diemLy = " + diemLy
				+ ", diemHoa = " + diemHoa + " ]";
	}
	
	
	
	

}
