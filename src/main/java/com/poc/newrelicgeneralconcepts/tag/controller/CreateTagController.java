package com.poc.newrelicgeneralconcepts.tag.controller;

import com.poc.newrelicgeneralconcepts.tag.controller.request.CreateTagRequest;
import com.poc.newrelicgeneralconcepts.tag.controller.response.CreateTagResponse;
import com.poc.newrelicgeneralconcepts.tag.service.CreateTagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateTagController {

	private final CreateTagService createTagService;

	@PostMapping("/v1/tags")
	public ResponseEntity<CreateTagResponse> execute(@RequestBody CreateTagRequest request){

		var response = createTagService.execute(request);

		return ResponseEntity.status(201).body(response);
	}
}

