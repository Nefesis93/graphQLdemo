package com.example.graph_ql_demo.service;

import com.example.graph_ql_demo.dto.RuoloDTO;
import com.example.graph_ql_demo.enumeration.RuoloEnum;
import com.example.graph_ql_demo.mapper.RuoloMapper;
import com.example.graph_ql_demo.rerepository.RuoloRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RuoloService {

    private final RuoloRepository repository;

    private final RuoloMapper mapper;

    public List<RuoloDTO> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public RuoloDTO findByNome(RuoloEnum ruoloEnum) {
        return mapper.toDTO(repository.getByNome(ruoloEnum));
    }
}
