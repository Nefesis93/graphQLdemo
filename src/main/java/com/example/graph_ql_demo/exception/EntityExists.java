package com.example.graph_ql_demo.exception;

import org.springframework.http.HttpStatus;

public abstract class EntityExists extends JsonResponse {

    private static final HttpStatus HTTP_STATUS = HttpStatus.CONFLICT;

    protected EntityExists(String errorMessage) {
        super(errorMessage, HTTP_STATUS);
    }
}
