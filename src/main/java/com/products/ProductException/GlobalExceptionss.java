package com.products.ProductException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionss {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> productException() {
		return new ResponseEntity<>("This product is not in the list", HttpStatus.BAD_REQUEST);
	}
	

}
