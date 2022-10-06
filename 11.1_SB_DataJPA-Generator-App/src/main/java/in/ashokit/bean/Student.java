package in.ashokit.bean;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	@SequenceGenerator(
			name="student",
			sequenceName="student_id_seq",
			allocationSize=1
			)
	
	@GeneratedValue(
			generator="student",
			strategy=GenerationType.SEQUENCE
			)
	
	@Column(name = "Stuent_Id")
	private Integer studentId;

	@Column(name = "stu_name")
	private String studentName;
	
	@Column(name = "stu_email")
	private String studentEmail;

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ "]";
	}


	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
