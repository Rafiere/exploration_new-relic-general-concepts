package com.poc.newrelicgeneralconcepts.tag.controller.response;

public record CreateTagResponse(String id, String name) {

	public static CreateTagResponse of(String id, String name){
		return new CreateTagResponse(id, name);
	}
}
