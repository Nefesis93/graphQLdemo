package com.example.graph_ql_demo.exception;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public abstract class JsonResponse {

	private final String status;

	private final int statusCode;

	private final String errorMessage;

	protected JsonResponse(String errorMessage, HttpStatus httpStatus) {
		this.errorMessage = errorMessage;
		status = httpStatus.name();
		statusCode = httpStatus.value();
	}
}
