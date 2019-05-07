package com.docker.tech.unit.dockertechunit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/docker/rest/api/personsName")
public class PersonsList {

    @GetMapping
    public List<String> personsList() {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setAge(23);
        person1.setFirstName("Daniel");
        person1.setLastName("Loureiro");
        Person person2 = new Person();
        person2.setAge(23);
        person2.setFirstName("André");
        person2.setLastName("Neto");
        personList.add(person1);
        personList.add(person2);
        return personList.stream().map(Person::getFirstName).collect(Collectors.toList());
    }
}
