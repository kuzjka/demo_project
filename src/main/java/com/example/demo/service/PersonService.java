package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public Person findPerson(long id) {
        return personRepository.findOne(id);
    }

    public void deletePerson(long[] ids) {
        for (long id : ids) {
            personRepository.delete(id);
        }
    }

    public void updatePerson(Person person) {
        personRepository.save(person);
    }

    public List<Person> personList() {
        return (List<Person>) personRepository.findAll();
    }
}
