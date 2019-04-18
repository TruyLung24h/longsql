package bootsample.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="danhmuctintuc")
public class DanhMucTinTuc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String madanhmuctintuc;
	private String  danhmuctintuc;
	
	public DanhMucTinTuc() {};
	
	public DanhMucTinTuc(String madanhmuctintuc,String danhmuctintuc) {
		super();
		this.madanhmuctintuc= madanhmuctintuc;
		this.danhmuctintuc=danhmuctintuc;
	};
	
	public String getMadanhmuctintuc() {
		return madanhmuctintuc;
	}
	public void setMadanhmuctintuc(String madanhmuctintuc) {
		this.madanhmuctintuc = madanhmuctintuc;
	}
	public String getDanhmuctintuc() {
		return danhmuctintuc;
	}
	public void setDanhmuctintuc(String danhmuctintuc) {
		this.danhmuctintuc = danhmuctintuc;
	}

}
