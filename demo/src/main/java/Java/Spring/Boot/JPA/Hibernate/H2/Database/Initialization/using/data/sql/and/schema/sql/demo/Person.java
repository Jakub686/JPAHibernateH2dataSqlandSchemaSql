package Java.Spring.Boot.JPA.Hibernate.H2.Database.Initialization.using.data.sql.and.schema.sql.demo;


import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;

    //public Person() {    }

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
