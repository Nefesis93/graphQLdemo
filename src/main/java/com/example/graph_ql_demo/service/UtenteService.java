package com.example.graph_ql_demo.service;

import com.example.graph_ql_demo.dto.BaseUtente;
import com.example.graph_ql_demo.dto.UtenteDTO;
import com.example.graph_ql_demo.entity.Utente;
import com.example.graph_ql_demo.exception.UtenteExists;
import com.example.graph_ql_demo.exception.UtenteNotFound;
import com.example.graph_ql_demo.mapper.BaseUtenteMapper;
import com.example.graph_ql_demo.mapper.UtenteMapper;
import com.example.graph_ql_demo.rerepository.RuoloRepository;
import com.example.graph_ql_demo.rerepository.UtenteRepository;
import com.example.graph_ql_demo.unions.UtenteExistsUnion;
import com.example.graph_ql_demo.unions.UtenteNotFoundUnion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UtenteService {

    private final UtenteRepository utenteRepository;

    private final RuoloRepository ruoloRepository;

    private final UtenteMapper utenteMapper;

    private final BaseUtenteMapper baseUtenteMapper;

    public UtenteExistsUnion insertUtente(BaseUtente utente) {
        if(!utenteRepository.findAllByMatricolaOrEmail(utente.getMatricola(), utente.getEmail()).isEmpty())
            return new UtenteExists();

        Utente utenteEntity = baseUtenteMapper.toEntity(utente);
        utenteEntity.setRuoli(utenteEntity.getRuoli().stream()
                .map(r -> ruoloRepository.getByNome(r.getNome()))
                .collect(Collectors.toSet()));

        return utenteMapper.toDTO(utenteRepository.save(utenteEntity));
    }

    public UtenteNotFoundUnion getUtente(String matricola) {
        Optional<Utente> utente = utenteRepository.findByMatricola(matricola);
        if(utente.isEmpty())
            return new UtenteNotFound();
        return utenteMapper.toDTO(utente.get());

    }
}
