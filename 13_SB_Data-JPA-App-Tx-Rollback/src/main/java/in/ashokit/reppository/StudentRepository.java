package in.ashokit.reppository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.bean.Address;

public interface StudentRepository extends JpaRepository<Address, Serializable> {

}
