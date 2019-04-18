package bootsample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="binhluan")
public class BinhLuan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String mabinhluan;
	private String matintuc;
	private String tendangnhap;
	private String noidung;
	private Date thoigiandangbinhluan;
	
	public BinhLuan() {};
	public BinhLuan(String mabinhluan,String matintuc,String tendangnhap,String noidung, Date thoigiandangbinhluan) {
		super();
		this.mabinhluan=mabinhluan;
		this.matintuc=matintuc;
		this.tendangnhap=tendangnhap;
		this.noidung=noidung;
		this.thoigiandangbinhluan=thoigiandangbinhluan;
	};
	
	public String getMabinhluan() {
		return mabinhluan;
	}
	public void setMabinhluan(String mabinhluan) {
		this.mabinhluan = mabinhluan;
	}
	public String getMatintuc() {
		return matintuc;
	}
	public void setMatintuc(String matintuc) {
		this.matintuc = matintuc;
	}
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public Date getThoigiandangbinhluan() {
		return thoigiandangbinhluan;
	}
	public void setThoigiandangbinhluan(Date thoigiandangbinhluan) {
		this.thoigiandangbinhluan = thoigiandangbinhluan;
	}
	
	
}
