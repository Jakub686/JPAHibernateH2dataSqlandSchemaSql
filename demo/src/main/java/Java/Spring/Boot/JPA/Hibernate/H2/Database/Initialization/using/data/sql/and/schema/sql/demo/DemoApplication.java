package Java.Spring.Boot.JPA.Hibernate.H2.Database.Initialization.using.data.sql.and.schema.sql.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DemoApplication.class, args);

		PersonRepository personRepository = configurableApplicationContext.getBean(PersonRepository.class);

		//dodawnie danych
		Person person = new Person("Crhis", "Anderson", 32);
		personRepository.save(person);
	}

}
