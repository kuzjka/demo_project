package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){


        model.addAttribute("persons", personService.personList());
        return "index";
    }

    @RequestMapping(value = "/add-person-page", method = RequestMethod.GET)
    public String addPersonPage(){
        return "add-person-page";
    }

    @RequestMapping(value = "/add-person", method = RequestMethod.POST)
    public String addPerson(@RequestParam String name,
                            @RequestParam int age,
                            @RequestParam int height,
                            @RequestParam int weight,
                            Model model){
        personService.addPerson(new Person(name, age, height, weight));
        model.addAttribute("persons", personService.personList());
        return "index";
    }

    @RequestMapping(value = "/delete-person", method = RequestMethod.POST)
    public String deletePerson(@RequestParam long[]ids, Model model){
        personService.deletePerson(ids);
        model.addAttribute("persons", personService.personList());
        return "index";
    }

    @RequestMapping(value = "/update-person-page/{id}", method = RequestMethod.GET)
    public String updatePersonPage(@PathVariable long id, Model model){

        Person person = personService.findPerson(id);
        model.addAttribute("person", person);
        return "update-person-page";
    }

    @RequestMapping(value = "/update-person", method = RequestMethod.POST)
    public String updatePerson(@Valid Person person, Errors errors,
                        Model model) {
        if (errors.hasErrors()) {
            return "/update-person-page";
        }

        personService.updatePerson(person);
        return "redirect:/";
    }

}
