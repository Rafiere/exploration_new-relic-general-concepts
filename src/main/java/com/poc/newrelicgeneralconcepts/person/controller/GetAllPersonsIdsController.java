package com.poc.newrelicgeneralconcepts.person.controller;

import com.poc.newrelicgeneralconcepts.person.controller.response.GetAllPersonsIdsResponse;
import com.poc.newrelicgeneralconcepts.person.service.GetAllPersonsIdsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetAllPersonsIdsController {

	private final GetAllPersonsIdsService getAllPersonIdsService;

	@GetMapping("/v1/persons/ids")
	public ResponseEntity<GetAllPersonsIdsResponse> execute(){

		var response = getAllPersonIdsService.execute();

		return ResponseEntity.status(200).body(response);
	}
}
