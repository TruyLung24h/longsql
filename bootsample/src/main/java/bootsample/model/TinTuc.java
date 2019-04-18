package bootsample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tintuc")

public class TinTuc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String matintuc;
	private String madanhmuctintuc;
	private String tendangnhap;
	private String tieude;
	private String hinhanh;
	private long noidung;
	private Date thoigiandangbai;
	
	public TinTuc() {};
	
	public TinTuc(String matintuc, String madanhmuctintuc, String tendangnhap, String tieude, String hinhanh, long noidung, Date thoigiandangbai) {
		super();
		this.matintuc=matintuc;
		this.madanhmuctintuc=madanhmuctintuc;
		this.tendangnhap=tendangnhap;
		this.tieude=tieude;
		this.hinhanh=hinhanh;
		this.noidung=noidung;
		this.thoigiandangbai=thoigiandangbai;
	};
	
	
	public String getMatintuc() {
		return matintuc;
	}
	public void setMatintuc(String matintuc) {
		this.matintuc = matintuc;
	}
	public String getMadanhmuctintuc() {
		return madanhmuctintuc;
	}
	public void setMadanhmuctintuc(String madanhmuctintuc) {
		this.madanhmuctintuc = madanhmuctintuc;
	}
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public long getNoidung() {
		return noidung;
	}
	public void setNoidung(long noidung) {
		this.noidung = noidung;
	}
	public Date getThoigiandangbai() {
		return thoigiandangbai;
	}
	public void setThoigiandangbai(Date thoigiandangbai) {
		this.thoigiandangbai = thoigiandangbai;
	}
	
}
