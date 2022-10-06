package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import in.ashokit.bean.Student;
import in.ashokit.reppository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	StudentRepository repo = context.getBean(StudentRepository.class);
Student stu=new Student();
stu.setStudentName("amit");
stu.setStudentEmail("amit@gmail.com");

Student savedEntity = repo.save(stu);
System.out.println(savedEntity);

}
}