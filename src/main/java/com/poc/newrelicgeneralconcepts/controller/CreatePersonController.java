package com.poc.newrelicgeneralconcepts.controller;

import com.poc.newrelicgeneralconcepts.controller.request.CreatePersonRequest;
import com.poc.newrelicgeneralconcepts.controller.response.CreatePersonResponse;
import com.poc.newrelicgeneralconcepts.service.CreatePersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreatePersonController {

	private final CreatePersonService createPersonService;

	@PostMapping("/v1/persons")
	public ResponseEntity<CreatePersonResponse> execute(@RequestBody CreatePersonRequest request){

		var response = createPersonService.execute(request);

		return ResponseEntity.status(201).body(response);
	}
}
