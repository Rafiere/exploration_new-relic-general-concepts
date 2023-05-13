package com.poc.newrelicgeneralconcepts.person.service;

import com.poc.newrelicgeneralconcepts.person.controller.request.CreatePersonRequest;
import com.poc.newrelicgeneralconcepts.person.controller.response.CreatePersonResponse;
import com.poc.newrelicgeneralconcepts.person.domain.Person;
import com.poc.newrelicgeneralconcepts.person.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class CreatePersonService {

	private final PersonRepository personRepository;
	public CreatePersonResponse execute(CreatePersonRequest request){

		Person createdPerson = Person.of(request.name(), request.age());

		personRepository.save(createdPerson);

		return CreatePersonResponse.of(createdPerson.getId(), createdPerson.getName(), createdPerson.getAge());
	}
}
