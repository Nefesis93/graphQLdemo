package com.example.grah_ql_demo.rerepository;

import com.example.grah_ql_demo.entity.UtenteRuoloEntity;
import com.example.grah_ql_demo.entity.UtenteRuoloKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRuoloRepository extends JpaRepository<UtenteRuoloEntity, UtenteRuoloKey> {
}
