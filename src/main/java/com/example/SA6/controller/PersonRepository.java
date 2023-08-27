package com.example.SA6.controller;

import com.example.SA6.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer > {
}