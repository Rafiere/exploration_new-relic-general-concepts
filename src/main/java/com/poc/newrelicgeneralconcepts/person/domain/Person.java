package com.poc.newrelicgeneralconcepts.person.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Person {

	@Id private String id;
	private String name;
	private Long age;

	public static Person of(String name, Long age){
		return new Person(name, age);
	}

	private Person(String name, Long age){
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.age = age;
	}
}
