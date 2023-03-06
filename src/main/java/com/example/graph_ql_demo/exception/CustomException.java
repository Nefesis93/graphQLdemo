package com.example.graph_ql_demo.exception;
import lombok.Getter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.http.HttpStatus;


@Getter
public abstract class CustomException extends RuntimeException {

	private final ErrorType errorType;
	private final HttpStatus httpStatus;

	protected CustomException(String errorMessage, ErrorType errorType, HttpStatus httpStatus) {
		super(errorMessage);
		this.errorType = errorType;
		this.httpStatus = httpStatus;
	}
}
