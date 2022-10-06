package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import in.ashokit.bean.Employee;
import in.ashokit.reppository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	EmpRepository repo = context.getBean(EmpRepository.class);
	
	//descending
	 List<Employee>list=repo.findAll(Sort.by("id").descending());
	 
	 //ascending 
	// List<Employee>list=repo.findAll(Sort.by("empSal").ascending());
	 
	 //or  defaultS
	// List<Employee>list=repo.findAll(Sort.by("emp_name"));
		
		list.forEach(emp -> {
		
				System.out.println(emp);
				
		});
					

	}

}
