package com.example.graph_ql_demo.exception;

import com.example.graph_ql_demo.unions.UtenteExistsUnion;

public class UtenteExists extends EntityExists implements UtenteExistsUnion {
    private static final String ERROR_MESSAGE = "Esiste già un utente con quella matricola o quell'email";

    public UtenteExists() {
        super(ERROR_MESSAGE);
    }
}
