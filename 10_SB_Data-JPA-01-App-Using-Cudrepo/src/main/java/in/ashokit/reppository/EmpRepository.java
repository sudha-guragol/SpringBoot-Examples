package in.ashokit.reppository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.bean.Employee;

public interface EmpRepository extends CrudRepository<Employee, Serializable>
{

}
