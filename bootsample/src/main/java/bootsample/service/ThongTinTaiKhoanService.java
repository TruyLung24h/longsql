package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.ThongTinTaiKhoanRepository;
import bootsample.model.ThongTinTaiKhoan;

@Service
@Transactional
public class ThongTinTaiKhoanService {
	private final ThongTinTaiKhoanRepository thongtintaikhoanRepository;

	public ThongTinTaiKhoanService(ThongTinTaiKhoanRepository thongtintaikhoanRepository) {
		this.thongtintaikhoanRepository = thongtintaikhoanRepository;
	}
	
	public List<ThongTinTaiKhoan> findAll(){
		List<ThongTinTaiKhoan> thongtintaikhoans = new ArrayList<>();
		for(ThongTinTaiKhoan thongtintaikhoan : thongtintaikhoanRepository.findAll()){
			thongtintaikhoans.add(thongtintaikhoan);
		}
		return thongtintaikhoans;
	}
	
	public void findThongTinTaiKhoan(String tendangnhap){
		thongtintaikhoanRepository.findById(tendangnhap);
	}
	
	public void save(ThongTinTaiKhoan thongtintaikhoan){
		thongtintaikhoanRepository.save(thongtintaikhoan);
	}
	
	public void delete(String tendangnhap){
		thongtintaikhoanRepository.deleteById(tendangnhap);
	}
}
