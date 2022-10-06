package in.ashokit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import ch.qos.logback.core.net.SyslogOutputStream;
import in.ashokit.bean.Employee;
import in.ashokit.bean.product;
import in.ashokit.reppository.EmpRepository;
import in.ashokit.reppository.ProductRepository;

@SpringBootApplication
public class Application {

	private static final String ProductRepository = null;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		////gives proxy object(v cant create interface obj data jpa creates proxy implementation class )
		EmpRepository repo = context.getBean(EmpRepository.class);
		System.out.println(repo.getClass().getName());		
	//	List<Employee>list=repo.findAll();
		

		//-----Sorting based on names------------(Not working)

				/*List<Employee>list=repo.findAll(Sort.by("emp_name").ascending());
				 //or
				 * List<Employee>list=repo.findAll(Sort.by("emp_name"));
				 * 
				 * List<Employee>list=repo.findAll(Sort.by("emp_name").descending());
						
					list.forEach(emp -> {
					
							System.out.println(emp);
							
					});*/
								
		
		
						/*
						Iterable<Employee> findAll = repo.findAll();
						findAll.forEach(emp ->{
							System.out.println(emp);
						});*/
						
		//Save-----------------------
		
	
	/*	Employee emp=new Employee();
		emp.setEmp_name("Usha");
		emp.setEmpSal(70000.24);
		emp.setId(104);
		repo.save(emp);
		System.out.println(".......Records Saved in Employee.............");*/
		
		//--------------Save All---------------------
		
/*	Employee e1=new Employee(301,"sudha rani",50000.9);
	Employee e2=new Employee(402,"fareeda",10000.8);
	Employee e3=new Employee(403,"kamal",10000.76);
	
	
	List<Employee> list=new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	repo.saveAll(list);*/
	
	//--------------Find by ID--------------
	/*Optional<Employee> findById=repo.findById(103);
	if(findById.isPresent())
	{
		System.out.println(findById.get());
	}
	else
	{
		System.out.println("record not available");
	}
	*/
		
		
		//--------------FIND ALL BY ID'S--------------------
		
	/*	
		List<Serializable> empId=new ArrayList<>();
		empId.add(201);
		empId.add(202);
		empId.add(203);
		Iterable<Employee> emps = repo.findAllById(empId);
		
		emps.forEach(emp ->{
			System.out.println(emp);
			
				
		});*/
		
		//-----------fetching all records from DB-----
		
		
		Iterable<Employee> findAll = repo.findAll();
		findAll.forEach(emp ->{
			System.out.println(emp);
		});
		
		
		
		//--------------Fetch Count of records---------
		
		/*long count = repo.count();
		System.out.println("Count of Records in DB:"+count);*/
		
		
		
		//========check whether that perticular id is available====
		
/*		boolean isAvailable = repo.existsById(101);
		System.out.println("perticular Id is present:"+isAvailable);*/
		
		
		//============Deleting particula record==========
		
	//	repo.deleteById(104);
		
		
		
		
		
			
		
	
	
	/*
		ProductRepository proRepo = context.getBean(ProductRepository.class);
		
		
		product p=new product();
		p.setpId(200);
		p.setPnamel("Desktop");
		p.setPrice(15000.21);
		proRepo.save(p);
		
		System.out.println(".......Records Saved.in Product............");*/
	}

}
