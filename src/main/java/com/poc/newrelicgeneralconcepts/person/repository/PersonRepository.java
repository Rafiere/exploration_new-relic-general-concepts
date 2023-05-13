package com.poc.newrelicgeneralconcepts.person.repository;

import com.poc.newrelicgeneralconcepts.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, String> {

	@Query("SELECT p.id FROM Person p")
	List<String> getAllPersonsIds();
}
