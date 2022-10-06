package in.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.bean.OrderDetailsEntity;
import in.ashokit.bean.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	OrderDetailsRepository repo = context.getBean(OrderDetailsRepository.class);
	
	
	OrderDetailsEntity entity=new OrderDetailsEntity();
	entity.setOrderBy("Miller");
	entity.setOrderPlacedDate(new Date());
	OrderDetailsEntity savedEntity = repo.save(entity);
	System.out.println(savedEntity);
	
	context.close();
	
	}

}
