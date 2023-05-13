package com.poc.newrelicgeneralconcepts.tag.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Tag {

	@Id private String id;
	private String name;

	public static Tag of(String name){
		return new Tag(name);
	}

	private Tag(String name){
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
}
