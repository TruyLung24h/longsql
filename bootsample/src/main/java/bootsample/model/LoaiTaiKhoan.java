package bootsample.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="loaitaikhoan")
public class LoaiTaiKhoan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String maloaitaikhoan;
	
	private String loaitaikhoan;
	private int mucluong;
	
	
	public LoaiTaiKhoan(){}
	
	public LoaiTaiKhoan(String maloaitaikhoan, String loaitaikhoan, int mucluong) {
		super();
		this.maloaitaikhoan = maloaitaikhoan;
		this.loaitaikhoan = loaitaikhoan;
		this.mucluong = mucluong;
	}
	
	public String getMaloaitaikhoan() {
		return maloaitaikhoan;
	}

	public void setMaloaitaikhoan(String maloaitaikhoan) {
		this.maloaitaikhoan = maloaitaikhoan;
	}

	public String getLoaitaikhoan() {
		return loaitaikhoan;
	}

	public void setLoai_taikhoan(String loaitaikhoan) {
		this.loaitaikhoan = loaitaikhoan;
	}

	public int getMucluong() {
		return mucluong;
	}

	public void setMuc_luong(int mucluong) {
		this.mucluong = mucluong;
	}

}
