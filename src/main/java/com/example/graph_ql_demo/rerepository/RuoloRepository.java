package com.example.graph_ql_demo.rerepository;

import com.example.graph_ql_demo.entity.Ruolo;
import com.example.graph_ql_demo.enumeration.RuoloEnum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuoloRepository extends JpaRepository<Ruolo, Long> {
    Ruolo getByNome(RuoloEnum ruolo);
}
