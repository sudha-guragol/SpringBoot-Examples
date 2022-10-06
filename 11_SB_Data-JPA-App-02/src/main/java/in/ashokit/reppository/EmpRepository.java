package in.ashokit.reppository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.bean.Employee;

public interface EmpRepository extends CrudRepository<Employee, Serializable>
{
public List<Employee> findByempName(String name);

public List<Employee> findByempSal(double salary);

public List<Employee> findByEmpNameAndEmpSal(String name, Double salary);
public List<Employee> findByEmpSalGreaterThan(Double salary);

public List<Employee> findByEmpNameIn(List<String> names);


//hql query
@Query("select empSal from Employee where empName=:name")
public Double findEmpSalByempName(String name);

//normal sql queries
//if you dont mention nativequery that wont be considered as sql
@Query(value="select count(*) from emp_tab",nativeQuery=true)
public Integer getCount();

}

