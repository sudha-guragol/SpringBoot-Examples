package in.ashokit.reppository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.bean.Employee;

public interface AddressRepository extends JpaRepository<Employee, Serializable>
{


}

