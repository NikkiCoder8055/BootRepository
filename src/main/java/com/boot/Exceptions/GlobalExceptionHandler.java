package com.boot.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.boot.Util.apiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<apiResponse> ResourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		String message = ex.getMessage();
		apiResponse apiResponse = new apiResponse(message,false);
		return new ResponseEntity<apiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
}
