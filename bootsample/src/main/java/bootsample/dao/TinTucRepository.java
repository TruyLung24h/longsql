package bootsample.dao;

import org.springframework.data.repository.CrudRepository;

import bootsample.model.TinTuc;

public interface TinTucRepository extends CrudRepository<TinTuc, String> {

}
