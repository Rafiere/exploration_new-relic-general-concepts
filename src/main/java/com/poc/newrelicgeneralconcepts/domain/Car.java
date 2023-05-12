package com.poc.newrelicgeneralconcepts.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Car {

	@Id private String id;
	private String model;

	public static Car of(String model){
		return new Car(model);
	}

	private Car(String model){
		this.id = UUID.randomUUID().toString();
		this.model = model;
	}
}
