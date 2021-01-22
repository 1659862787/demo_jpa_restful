package com.offcn.demo_jpa_restful.dao;

import com.offcn.demo_jpa_restful.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path="myperson")
public interface PersonDao extends JpaRepository<Person,Long> {

    @RestResource(path = "findname")
    List<Person> findByNameContains(@Param("name")String name);
     @RestResource(path = "findnames")
    List<Person> findByNameIs(@Param("name")String name);



}
