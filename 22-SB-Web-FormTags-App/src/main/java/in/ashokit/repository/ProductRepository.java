package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.bindings.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Serializable>{

}
