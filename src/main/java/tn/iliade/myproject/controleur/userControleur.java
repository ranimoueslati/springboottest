package tn.iliade.myproject.controleur;

import org.springframework.web.bind.annotation.*;
import tn.iliade.myproject.entity.user;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class userControleur {

    @Autowired
    tn.iliade.myproject.service.userService userService;
    @GetMapping ("/user")
    @ResponseBody
    public List<user> getAllUser(){
       List<user> list=userService.getAllUser();

        return list;
    }

    @PostMapping("/ajouterUser")
    @ResponseBody
    public user ajouterUser(@RequestBody user u) {
        return userService.ajouterUser(u);
    }

    @DeleteMapping("deleteUser/{id}")
    @ResponseBody
    public void deleteUser (@PathVariable("id") Integer id){
        userService.deleteUser(id);
    }
    @PutMapping("/updateUser")
    @ResponseBody
    public user modifyClient(@RequestBody user u) {
        return userService.updateUser(u);
}}
