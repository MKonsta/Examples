package entity;

import javax.persistence.*;

//@Entity
@Embeddable
public class HomeAddress {
//    @Id
//    @GeneratedValue
//    private int id;
    private String street;


    public HomeAddress() {}
    public HomeAddress(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}
