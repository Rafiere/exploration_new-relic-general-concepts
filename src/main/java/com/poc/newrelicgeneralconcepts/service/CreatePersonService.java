package com.poc.newrelicgeneralconcepts.service;

import com.poc.newrelicgeneralconcepts.controller.request.CreatePersonRequest;
import com.poc.newrelicgeneralconcepts.controller.response.CreatePersonResponse;
import com.poc.newrelicgeneralconcepts.domain.Person;
import com.poc.newrelicgeneralconcepts.repository.PersonRepository;
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

		return new CreatePersonResponse(createdPerson.getId(), createdPerson.getName(), createdPerson.getAge());
	}
}
