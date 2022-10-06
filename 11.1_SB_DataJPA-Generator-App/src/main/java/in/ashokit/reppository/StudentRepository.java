package in.ashokit.reppository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import in.ashokit.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable>
{

}
