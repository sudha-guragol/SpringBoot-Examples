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
import in.ashokit.service.EmpService;


@SpringBootApplication
public class Application {

	

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		 EmpService service = context.getBean(EmpService.class);
		 
		 service.saveData();
		

		

}
	
	
}