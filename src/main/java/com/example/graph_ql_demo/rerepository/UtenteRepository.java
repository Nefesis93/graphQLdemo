package com.example.graph_ql_demo.rerepository;

import com.example.graph_ql_demo.entity.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, String> {
}
