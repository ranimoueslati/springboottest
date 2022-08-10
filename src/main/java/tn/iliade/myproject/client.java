package tn.iliade.myproject;


import tn.iliade.myproject.entity.user;

import javax.persistence.Table;

@Table(name = "CLIENT")

public class client extends user {


    private String email;
    private Integer age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "client{" +
                "email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public client(Integer id, String name , String email , Integer age)  {
        super(id, name);
        this.email = email;
        this.age = age;
    }
}

