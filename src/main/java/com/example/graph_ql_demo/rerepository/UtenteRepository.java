package com.example.graph_ql_demo.rerepository;

import com.example.graph_ql_demo.entity.UtenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<UtenteEntity, String> {
}
