package com.compositeDesign.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
	
	private ResponseUtil() {

	}

	public static <T> ResponseEntity<T> ok(T responseBody) {
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
	}

	public static <T> ResponseEntity<T> created(T responseBody) {
		return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
	}

	public static <T> ResponseEntity<T> accepted(T responseBody) {
		return new ResponseEntity<>(responseBody, HttpStatus.ACCEPTED);
	}

	public static <T> ResponseEntity<T> badRequest(T responseBody) {
		return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
	}

	public static <T> ResponseEntity<T> notFound(T responseBody) {
		return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
	}

	public static <T> ResponseEntity<T> internalServerError(T responseBody) {
		return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
