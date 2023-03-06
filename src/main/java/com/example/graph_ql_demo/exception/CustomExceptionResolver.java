package com.example.graph_ql_demo.exception;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

@Component
public class CustomExceptionResolver extends DataFetcherExceptionResolverAdapter {

    static final String CUSTOM_EXCEPTION = "CustomException";

    @Override
    protected GraphQLError resolveToSingleError(Throwable e, DataFetchingEnvironment env) {
        if (e instanceof CustomException customException) {
            return GraphqlErrorBuilder.newError()
                    .errorType(customException.getErrorType())
                    .message(customException.getMessage())
                    .path(env.getExecutionStepInfo().getPath())
//                    .location(env.getField().getSourceLocation())
                    .build();
        }
        return null;
    }
}