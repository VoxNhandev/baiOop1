package BaiTapHuongDoiTuong;

public class SinhVien {
	private String name;
	private String studentCode;
	private double mathMark;
	private double physicsMark;
	private double chemistryMark;
	
	public SinhVien(String name, String studentCode, double mathMark, double physicsMark, double chemistryMark) {
		this.name = name;
		this.studentCode = studentCode;
		this.mathMark = mathMark;
		this.physicsMark = physicsMark;
		this.chemistryMark = chemistryMark;
	}
	
	public SinhVien() {};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public double getMathMark() {
		return mathMark;
	}

	public void setMathMark(double mathScores) {
		this.mathMark = mathScores;
	}

	public double getPhysicsMark() {
		return physicsMark;
	}

	public void setPhysicsMark(double physicsMark) {
		this.physicsMark = physicsMark;
	}

	public double getChemistryMark() {
		return chemistryMark;
	}

	public void setChemistryScores(double chemistryMark) {
		this.chemistryMark = chemistryMark;
		}
	
	public void resultMediumMark()
	{
		double result = (this.mathMark + this.physicsMark + this.chemistryMark ) / 3;
		System.out.println("Student name: " + this.name);
		System.out.println("result average Mark: " + result);
		System.out.println("------------");
	}
	
	public double resultAverageMark()
	{
		double result = (this.mathMark + this.physicsMark + this.chemistryMark ) / 3;
		return result;
	}
}
