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
	
	
	
	public Employee(Integer id, String emp_name, Double empSal) {
		super();
		this.id = id;
		this.empName = emp_name;
		this.empSal = empSal;
	}



	@Id
	@Column(name="emp_id")
	private Integer id;
	@Column(name="emp_name")
	
	private String empName;
	
	@Column(name="emp_sal")
	private Double empSal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + empName + ", empSal=" + empSal + "]";
	}

}
