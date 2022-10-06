package in.ashokit.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.bean.Address;
import in.ashokit.bean.Employee;
import in.ashokit.reppository.StudentRepository;
import in.ashokit.reppository.AddressRepository;
@Service
public class EmpService {
	
	
@Autowired
private AddressRepository empRepo;

@Autowired
private StudentRepository addRepo;

@Transactional(rollbackFor=Exception.class)
	public void saveData()
	
	{
		Employee emp=new Employee();
		
	emp.setEmpId(212);
	emp.setEmpName("yadav");
	emp.setEmpSal(4);
	empRepo.save(emp);
	
	//record is not storing in table bcz we have mentioned rollback if exception occurs
	//int i=10/0;
	
	Address address=new Address();
	
	address.setAddressId(105);
	address.setEmpId(212);
	address.setCity("gulbarga");
	address.setState("karnataka");
	address.setCountry("india");
	addRepo.save(address);
	}

}
