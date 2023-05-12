package com.poc.newrelicgeneralconcepts.repository;

import com.poc.newrelicgeneralconcepts.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {

}
