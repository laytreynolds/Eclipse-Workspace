package com.qa.animalproject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Animal not found")
public class AnimalNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7848888632048965367L;

}