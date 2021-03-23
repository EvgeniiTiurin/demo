package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final DaoUser daoUser;


    public MainController(@Autowired DaoUser daoUser) {
        this.daoUser = daoUser;
    }

    @GetMapping("/{id}")
    public List<User> testRestGetMethod(@PathVariable Long id) {
        return daoUser.getUserById(id);
    }
}
