package in.ashokit.reppository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.bean.product;

public interface ProductRepository extends CrudRepository<product, Serializable>{

}
