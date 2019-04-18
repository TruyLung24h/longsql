package bootsample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="thongtintaikhoan")

public class ThongTinTaiKhoan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String tendangnhap;
	private String  matkhau;
	private String  maloaitaikhoan;
	private String  hinhanh;
	private String  hoten;
	private String  gioitinh;
	private Date  ngaysinh;
	private int  cmnd;
	private String  diachi;
	private int  sdt;
	
	
	public ThongTinTaiKhoan() {};
	
	public ThongTinTaiKhoan( String tendangnhap, String  matkhau,String  maloaitaikhoan,String  hinhanh,String  hoten,String  gioitinh,Date  ngaysinh,int  cmnd,String  diachi,int  sdt)
	{
		super();
		this.tendangnhap=tendangnhap;
		this.matkhau=matkhau;
		this.maloaitaikhoan=maloaitaikhoan;
		this.hinhanh=hinhanh;
		this.hoten=hoten;
		this.gioitinh=gioitinh;
		this.ngaysinh=ngaysinh;
		this.cmnd=cmnd;
		this.diachi=diachi;
		this.sdt=sdt;
		
	};
	
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getMaloaitaikhoan() {
		return maloaitaikhoan;
	}
	public void setMaloaitaikhoan(String maloaitaikhoan) {
		this.maloaitaikhoan = maloaitaikhoan;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgayinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
}
