package entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ElementCollection
    private List<HomeAddress> homeAddress;

    @ElementCollection
    @OrderBy("marks")
    private List<Integer> marks;

    public Person() {}

    public Person(String name, List<HomeAddress> homeAddress, List<Integer> marks) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.marks = marks;
    }
}
