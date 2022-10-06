package in.ashokit.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tab")
public class Employee {
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}




	@Id
	@Column(name="emp_id")
	private Integer empId;
	
	
	@Column(name="emp_name")
	
	private String empName;
	
	@Column(name="emp_sal")
	private Integer empSal;

	
	

	public String getEmpName() {
		return empName;
	}



	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	

	public Integer getEmpSal() {
		return empSal;
	}


	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}

	

	public Employee(Integer id, String empName, Integer empSal) {
		super();
		this.empId = id;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + empId + ", emp_name=" + empName + ", empSal=" + empSal + "]";
	}

}
