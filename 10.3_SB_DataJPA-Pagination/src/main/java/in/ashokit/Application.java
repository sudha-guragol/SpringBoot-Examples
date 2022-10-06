package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.ashokit.bean.Employee;
import in.ashokit.reppository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		EmpRepository bean = ctx.getBean(EmpRepository.class);
		int pageSize=3;
		int pageNo=0;
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<Employee> pageData =  bean.findAll(pageRequest);
		int totalPages = pageData.getTotalPages();
		System.out.println("Total pages:"+totalPages);
		List<Employee> list = pageData.getContent();
		 
		list.forEach(entity -> {
			System.out.println(entity);
		});


	}

}
