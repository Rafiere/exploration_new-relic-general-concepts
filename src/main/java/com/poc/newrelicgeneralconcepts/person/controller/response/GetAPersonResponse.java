package com.poc.newrelicgeneralconcepts.person.controller.response;

public record GetAPersonResponse(String id, String name, Long age) {

	public static GetAPersonResponse of(String id, String name, Long age){
		return new GetAPersonResponse(id, name, age);
	}
}
