package bootsample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample.dao.TinTucRepository;
import bootsample.model.TinTuc;

@Service
@Transactional
public class TinTucService {

	private final TinTucRepository tintucRepository;

	public TinTucService(TinTucRepository tintucRepository) {
		this.tintucRepository = tintucRepository;
	}
	
	public List<TinTuc> findAll(){
		List<TinTuc> tintucs = new ArrayList<>();
		for(TinTuc tintuc : tintucRepository.findAll()){
			tintucs.add(tintuc);
		}
		return tintucs;
	}
	
	public void findTinTuc(String matintuc){
		tintucRepository.findById(matintuc);
	}
	
	public void save(TinTuc task){
		tintucRepository.save(task);
	}
	
	public void delete(String matintuc){
		tintucRepository.deleteById(matintuc);
	}
}
