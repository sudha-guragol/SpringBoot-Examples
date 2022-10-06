package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.bean.ContactEntity;
import in.ashokit.repository.ContactEntityRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	 ContactEntityRepo bean= context.getBean(ContactEntityRepo.class);
	System.out.println(bean.getClass().getName());
	ContactEntity entity=new ContactEntity();
	entity.setContactId(502);
	entity.setContactName("kamal");
	entity.setContactNember(855888888);
	ContactEntity contactEntity = bean.save(entity);
	System.out.println(contactEntity);
	
	
	
	
//	bean.save(entity);
	}

}
