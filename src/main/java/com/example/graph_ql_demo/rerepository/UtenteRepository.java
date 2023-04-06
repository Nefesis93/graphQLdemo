package com.example.graph_ql_demo.rerepository;

import com.example.graph_ql_demo.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtenteRepository extends JpaRepository<Utente, String> {

    Optional<Utente> findByMatricola(String matricola);
    List<Utente> findAllByMatricolaOrEmail(String matricola, String email);
}
