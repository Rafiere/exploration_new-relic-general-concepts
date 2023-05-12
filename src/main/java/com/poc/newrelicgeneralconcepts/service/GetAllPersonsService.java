package com.poc.newrelicgeneralconcepts.service;

import com.poc.newrelicgeneralconcepts.controller.response.GetAPersonResponse;
import com.poc.newrelicgeneralconcepts.domain.Person;
import com.poc.newrelicgeneralconcepts.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class GetAllPersonsService {

	private final PersonRepository personRepository;

	public List<GetAPersonResponse> execute() {

		List<Person> allPersons = personRepository.findAll();

		return allPersons.stream()
		          .map(person -> GetAPersonResponse.of(person.getId(), person.getName(), person.getAge()))
		          .toList();
	}
}
