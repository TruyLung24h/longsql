package bootsample.service;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.LoaiTaiKhoanRepository;
import bootsample.model.LoaiTaiKhoan;

@Service
@Transactional
public class LoaiTaiKhoanService {
	private final LoaiTaiKhoanRepository loaitaikhoanRepository;

	public LoaiTaiKhoanService(LoaiTaiKhoanRepository loaitaikhoanRepository) {
		this.loaitaikhoanRepository = loaitaikhoanRepository;
	}
	
	public List<LoaiTaiKhoan> findAll(){
		List<LoaiTaiKhoan> loaitaikhoans = new ArrayList<>();
		for(LoaiTaiKhoan loaitaikhoan : loaitaikhoanRepository.findAll()){
			loaitaikhoans.add(loaitaikhoan);
		}
		return loaitaikhoans;
	}
	
	public void findLoaitaiKhoan(String maloaitaikhoan){
	 loaitaikhoanRepository.findById(maloaitaikhoan);
	}
	
	public void save(LoaiTaiKhoan loaitaikhoan){
		loaitaikhoanRepository.save(loaitaikhoan);
	}
	
	public void delete(String maloaitaikhoan){
		loaitaikhoanRepository.deleteById(maloaitaikhoan);
	}
}
