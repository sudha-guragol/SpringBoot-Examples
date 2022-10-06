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
		this.emp_name = emp_name;
		this.empSal = empSal;
	}



	@Id
	@Column(name="emp_id")
	private Integer id;
	@Column(name="empName")
	
	private String emp_name;
	
	@Column(name="emp_sal")
	private Double empSal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", emp_name=" + emp_name + ", empSal=" + empSal + "]";
	}

}
