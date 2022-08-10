package tn.iliade.myproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name = "USER")
public class user implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "ID_USER"
    )
    private Integer id;
    @Column(
            name = "USER_NAME"
    )
    private String name;


    public user( Integer id , String name) {
        this.id = id;
        this.name=name;   }

    public user() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
