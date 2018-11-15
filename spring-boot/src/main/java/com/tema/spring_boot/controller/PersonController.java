package com.tema.spring_boot.controller;
import com.tema.spring_boot.repository.PersonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tema.spring_boot.entity.Person;


@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonRepository PersonRepository;


    @PostMapping("/Persons")
    public Person create(@RequestBody Person Person)
    {
        return PersonRepository.save(Person);
    }


    @GetMapping("/Persons")
    public List<Person> findAll()
    {
        return PersonRepository.findAll();
    }


    @PutMapping("/Persons/{Person_id}")
    public Person update(@PathVariable("Person_id") Long PersonId, @RequestBody Person PersonObject)
    {
        Person Person = PersonRepository.findOne(PersonId);
        Person.setName(PersonObject.getName());
        return PersonRepository.save(Person);
    }



    @DeleteMapping("/Persons/{Person_id}")
    public List<Person> delete(@PathVariable("Person_id") Long PersonId)
    {
        PersonRepository.delete(PersonId);
        return PersonRepository.findAll();
    }



    @GetMapping("/Persons/{Person_id}")
    @ResponseBody
    public Person findByPersonId(@PathVariable("Person_id") Long PersonId)
    {
        return PersonRepository.findOne(PersonId);
    }
}
