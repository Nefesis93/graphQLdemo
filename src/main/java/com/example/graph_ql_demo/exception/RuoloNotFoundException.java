package com.example.graph_ql_demo.exception;

public class RuoloNotFoundException extends EntityNotFoundException {

    private static final String ERROR_MESSAGE = "Il ruolo richiesto non è stato trovato";

    public RuoloNotFoundException() {
        super(ERROR_MESSAGE);
    }
}
