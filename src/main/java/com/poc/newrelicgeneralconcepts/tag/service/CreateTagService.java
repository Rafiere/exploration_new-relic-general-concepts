package com.poc.newrelicgeneralconcepts.tag.service;

import com.poc.newrelicgeneralconcepts.tag.controller.request.CreateTagRequest;
import com.poc.newrelicgeneralconcepts.tag.controller.response.CreateTagResponse;
import com.poc.newrelicgeneralconcepts.tag.domain.Tag;
import com.poc.newrelicgeneralconcepts.tag.repository.TagRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class CreateTagService {

	private final TagRepository tagRepository;

	public CreateTagResponse execute(CreateTagRequest request){

		Tag newTag = Tag.of(request.name());

		tagRepository.save(newTag);

		return CreateTagResponse.of(newTag.getId(), newTag.getName());
	}
}
