package in.ashokit;

import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.ashokit.bean.Employee;
import in.ashokit.bean.product;
import in.ashokit.reppository.EmpRepository;


@SpringBootApplication
public class Application {

	private static final String ProductRepository = null;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		EmpRepository repo = context.getBean(EmpRepository.class);
		
	
		Employee emp=new Employee();
		
		
		//if emp_id is selected(case1)
		
		emp.setEmpId(101); //display records having id =201
		
		//if emp_name is selected (case2)
		
		emp.setEmpName("sudha"); //display records having emp id =101 and name="sudha"/if any one of the ceiteria doesnt match then it wont display any records(ex ;emp id =101 and name="salim")
		
		
		
		//if emp-sal is selected(case 3)
	//	 displays record having id=101,name="sudha",sal=50000(if anyone criteria doent match no records will be displayed (Ex:id=101,name="asha",sal=10010))
		emp.setEmpSal(50001);//
		Example<Employee> empExmpl=Example.of(emp);
		
		List<Employee> findAll = repo.findAll(empExmpl);
		
		for(Employee e :findAll)
		{
			System.out.println(e);
		}
		

}
	
	
}