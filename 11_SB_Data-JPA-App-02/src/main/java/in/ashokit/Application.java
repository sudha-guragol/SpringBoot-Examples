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


import in.ashokit.bean.Employee;
import in.ashokit.bean.product;
import in.ashokit.reppository.EmpRepository;
import in.ashokit.reppository.ProductRepository;

@SpringBootApplication
public class Application {

	private static final String ProductRepository = null;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//
		EmpRepository repo = context.getBean(EmpRepository.class);
		
		//==========Find bY name=========
		/*List<Employee> findByName	=repo.findByempName("fareeda");
	System.out.println(findByName);
	
	//========Find by salary=========
	
	List<Employee> findByempSal = repo.findByempSal(10001);
	System.out.println(findByempSal);*/
	
	
	//fetching records by using 2 columns
	
	/*List<Employee> findByEmpNameAndEmpSal = repo.findByEmpNameAndEmpSal("kamal", 10001.0);
	System.out.println(findByEmpNameAndEmpSal);
	}*/
		
		
		
		//=======Finding Emp sal greater than 500000=====
/*		List<Employee> findByEmpSalGreaterThan = repo.findByEmpSalGreaterThan(50000.0);
		findByEmpSalGreaterThan.forEach (emp->{
	System.out.println(emp);
});*/
		
		
		
		//===========Finding records with 2 names(using In clause============
/*		
List<Employee>	findByEmpNameIn=	repo.findByEmpNameIn(Arrays.asList("sudha","sudha rani","kamal"));
		findByEmpNameIn.forEach(emp -> {
			System.out.println(emp);
		});*/
		
		
		//==========Fetching emp salary based on name====
		
		Double salary = repo.findEmpSalByempName("usha");
		System.out.println(salary);
		

}
	
	
}