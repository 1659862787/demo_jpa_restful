package com.offcn.demo_jpa_restful.controller;

import com.offcn.demo_jpa_restful.dao.PersonDao;
import com.offcn.demo_jpa_restful.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*@RestController
@RequestMapping("/person")*/
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @GetMapping("/")
    public List<Person> list(){
        return personDao.findAll();
    }
}
