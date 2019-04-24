package entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@Entity
public class Adress {
    String street;
    int number;

    public Adress(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public Adress() {

    }
}
