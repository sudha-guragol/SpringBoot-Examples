package in.ashokit.bindings;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class User {
	
	@NotEmpty(message="Please enter UserName ")
	 @Pattern(regexp="^[A-Za-z]*$",message = "Please enter valid Input")
	private String uname;
	
	@NotEmpty(message="please enter password ")
	private String password;
	
	@Email
//	@Pattern(regexp="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}")
	@NotEmpty(message="plaese enter Email")
	private String email;
	

	
	//@NotEmpty("phone no field cant be empty")
	//@NotNull(message="please enter phone no ")
	//@Digits(fraction = 0, integer = 10)
	
	//@Pattern(regexp="(^$|[0-9]{10})", message="please enter valid phone no")
	//@Size(min=10,max=10)
	@NotNull(message="please enter phone no")
	private Long phoneNo;

}
