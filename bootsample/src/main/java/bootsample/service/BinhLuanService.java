package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.BinhLuanRepository;
import bootsample.model.BinhLuan;

@Service
@Transactional
public class BinhLuanService {
	private final BinhLuanRepository binhluanRepository;

	public BinhLuanService(BinhLuanRepository binhluanRepository) {
		this.binhluanRepository = binhluanRepository;
	}
	
	public List<BinhLuan> findAll(){
		List<BinhLuan> binhluans = new ArrayList<>();
		for(BinhLuan binhluan : binhluanRepository.findAll()){
			binhluans.add(binhluan);
		}
		return binhluans;
	}
	
	public List<BinhLuan> Seach(String name){
		List<BinhLuan> binhluans = new ArrayList<>();
		for(BinhLuan binhluan : binhluanRepository.findAll()){
			if(binhluan.getTendangnhap().equals(name))
			{
				binhluans.add(binhluan);
			}
		}
		return binhluans;
	}
	
    
	public void findBinhLuan(String mabinhluan){
		binhluanRepository.findById(mabinhluan);
	}
	
	public void save(BinhLuan binhluan){
		binhluanRepository.save(binhluan);
	}
	
	public void delete(String mabinhluan){
		binhluanRepository.deleteById(mabinhluan);
	}

}
