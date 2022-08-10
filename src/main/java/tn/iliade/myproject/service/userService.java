package tn.iliade.myproject.service;

import tn.iliade.myproject.entity.user;

import java.util.List;

public interface userService {
    user ajouterUser (user u);
    void deleteUser (user u);
    void deleteUser (Integer id);
    List<user>getAllUser();
    user updateUser(user u) ;


}
