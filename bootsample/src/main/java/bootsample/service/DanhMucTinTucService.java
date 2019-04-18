package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.DanhMucTinTucRepository;
import bootsample.model.DanhMucTinTuc;

@Service
@Transactional

public class DanhMucTinTucService {
	
	private final DanhMucTinTucRepository danhmuctintucRepository;

	public DanhMucTinTucService(DanhMucTinTucRepository danhmuctintucRepository) {
		this.danhmuctintucRepository = danhmuctintucRepository;
	}
	
	public List<DanhMucTinTuc> findAll(){
		List<DanhMucTinTuc> danhmuctintucs = new ArrayList<>();
		for(DanhMucTinTuc danhmuctintuc : danhmuctintucRepository.findAll()){
			danhmuctintucs.add(danhmuctintuc);
		}
		return danhmuctintucs;
	}
	
	public void findDanhMucTinTuc(String id){
		danhmuctintucRepository.findById(id);
	}
	
	public void save(DanhMucTinTuc danhmuctintuc){
		danhmuctintucRepository.save(danhmuctintuc);
	}
	
	public void delete(String id){
		danhmuctintucRepository.deleteById(id);
	}
}
