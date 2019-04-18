package bootsample.dao;

import org.springframework.data.repository.CrudRepository;


import bootsample.model.LoaiTaiKhoan;
public interface LoaiTaiKhoanRepository extends CrudRepository<LoaiTaiKhoan, String> {

}
