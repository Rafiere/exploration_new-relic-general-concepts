package com.poc.newrelicgeneralconcepts.person.service;

import com.poc.newrelicgeneralconcepts.person.controller.response.GetAllPersonsIdsResponse;
import com.poc.newrelicgeneralconcepts.person.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class GetAllPersonsIdsService {

	private final PersonRepository personRepository;

	public GetAllPersonsIdsResponse execute(){

		List<String> personsIds = personRepository.getAllPersonsIds();

		return GetAllPersonsIdsResponse.of(personsIds);
	}
}
