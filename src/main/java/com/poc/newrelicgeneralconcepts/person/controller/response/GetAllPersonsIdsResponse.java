package com.poc.newrelicgeneralconcepts.person.controller.response;

import java.util.List;

public record GetAllPersonsIdsResponse(List<String> ids) {

	public static GetAllPersonsIdsResponse of(List<String> personsIds){
		return new GetAllPersonsIdsResponse(personsIds);
	}
}
