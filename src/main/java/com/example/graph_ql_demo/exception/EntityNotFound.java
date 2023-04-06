package com.example.graph_ql_demo.exception;

import org.springframework.http.HttpStatus;

public abstract class EntityNotFound extends JsonResponse {

    private static final HttpStatus HTTP_STATUS = HttpStatus.NOT_FOUND;

    protected EntityNotFound(String errorMessage) {
        super(errorMessage, HTTP_STATUS);
    }

}
