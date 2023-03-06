package com.example.graph_ql_demo.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

@Getter
@Setter
@Builder
@ToString
public class JsonResponse {

    private Integer statusCode;
    private ErrorType errorType;
    private String message;

    @Builder.Default
    private Date timeStamp = new Date();

    public static JsonResponse buildError(CustomException e) {
        return buildError(e.getHttpStatus(), e.getErrorType(), e.getMessage());
    }

    public static JsonResponse buildError(HttpStatus status, ErrorType errorType, String message) {
        return JsonResponse.builder()
                .statusCode(status.value())
                .errorType(errorType)
                .message(message)
                .build();
    }
}
