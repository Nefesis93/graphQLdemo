package com.example.graph_ql_demo.exception;

import org.springframework.graphql.execution.ErrorType;
import org.springframework.http.HttpStatus;

public abstract class EntityNotFoundException extends  CustomException{

    private static final ErrorType ERROR_TYPE = ErrorType.NOT_FOUND;

    private static final HttpStatus HTTP_STATUS = HttpStatus.NOT_FOUND;

    protected EntityNotFoundException(String errorMessage) {
        super(errorMessage, ERROR_TYPE, HTTP_STATUS);
    }

}
