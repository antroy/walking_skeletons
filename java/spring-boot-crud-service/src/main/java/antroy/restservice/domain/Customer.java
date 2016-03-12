package antroy.restservice.domain;

import org.springframework.boot.orm.jpa.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by anthonyr on 07/02/2016.
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String address1;
    @Column
    private String address2;

    public Customer(){}

    public Customer(final String name, final String address1, final String address2){
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

