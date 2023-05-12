package com.poc.newrelicgeneralconcepts.controller.response;

public record CreatePersonResponse(String id, String name, Long age) {

	public static CreatePersonResponse of(String id, String name, Long age){
		return new CreatePersonResponse(id, name, age);
	}
}
