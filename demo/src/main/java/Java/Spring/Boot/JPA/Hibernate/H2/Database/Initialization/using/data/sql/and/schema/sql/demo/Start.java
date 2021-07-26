package Java.Spring.Boot.JPA.Hibernate.H2.Database.Initialization.using.data.sql.and.schema.sql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private PersonRepository personRepository;

    @Autowired
    public Start(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    //sposob dodawania danych
    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){

          //sposob dodawania danych
        Person person1 = new Person("A","a",32);
        personRepository.save(person1);

        Person person2 = new Person("B","b",33);
        personRepository.save(person2);

        Person person3 = new Person("V","v",34);
        personRepository.save(person3);


        //personRepository.deleteAllById(5L);




    }


}
