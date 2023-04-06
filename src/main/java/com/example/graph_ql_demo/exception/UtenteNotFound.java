package com.example.graph_ql_demo.exception;

import com.example.graph_ql_demo.unions.UtenteNotFoundUnion;

public class UtenteNotFound extends EntityNotFound implements UtenteNotFoundUnion {
    private static final String ERROR_MESSAGE = "Nessuna matricola corrispondente";

    public UtenteNotFound() {
        super(ERROR_MESSAGE);
    }
}
