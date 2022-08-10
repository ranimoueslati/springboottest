package tn.iliade.myproject;

import tn.iliade.myproject.entity.user;

import javax.persistence.Table;


@Table(name = "ADMIN")
public class admin extends user {
    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "admin{" +
                "pwd='" + pwd + '\'' +
                '}';
    }

    public admin(Integer id, String name, String pwd) {
        super (id,name);
        this.pwd = pwd;
    }
}