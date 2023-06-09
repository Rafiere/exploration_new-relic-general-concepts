package com.poc.newrelicgeneralconcepts.person.controller;

import com.poc.newrelicgeneralconcepts.person.controller.response.GetAPersonResponse;
import com.poc.newrelicgeneralconcepts.person.service.GetAllPersonsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetAllPersonsController {

	private final GetAllPersonsService getAllPersonsService;

	@GetMapping("/v1/persons")
	public ResponseEntity<List<GetAPersonResponse>> execute(){

		var response = getAllPersonsService.execute();

		return ResponseEntity.status(201).body(response);
	}
}
