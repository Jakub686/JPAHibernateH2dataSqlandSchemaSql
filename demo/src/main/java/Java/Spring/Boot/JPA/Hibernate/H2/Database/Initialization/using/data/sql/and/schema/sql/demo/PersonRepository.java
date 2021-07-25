package Java.Spring.Boot.JPA.Hibernate.H2.Database.Initialization.using.data.sql.and.schema.sql.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {


}
