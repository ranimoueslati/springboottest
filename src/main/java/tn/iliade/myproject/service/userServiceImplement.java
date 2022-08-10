package tn.iliade.myproject.service;

import tn.iliade.myproject.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.iliade.myproject.repository.userRepository;

import java.util.List;

@Service
public class userServiceImplement implements userService  {
    @Autowired
    userRepository repUser ;

    @Override
    public user ajouterUser(user u) {
        repUser.save(u);
        return u;
    }

    @Override
    public void deleteUser(user u) {
        repUser.delete(u);
    }

    @Override
    public void deleteUser(Integer id) {
        repUser.deleteById(id);
    }

    @Override
    public List<user> getAllUser() {

        return (List<user>) repUser.findAll();
    }

    @Override
    public user updateUser(user u) {
        return repUser.save(u);
    }



    }

