package com.example.graph_ql_demo.controller;


import com.example.graph_ql_demo.entity.Ruolo;
import com.example.graph_ql_demo.exception.RuoloNotFoundException;
import com.example.graph_ql_demo.rerepository.RuoloRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Slf4j
@Controller
public class RuoloController {

    @Autowired
    private RuoloRepository repository;

    @QueryMapping
    public List<Ruolo> ruoli() {
        return repository.findAll();
    }

    @QueryMapping
    public Object ruolo(@Argument Long id) { return repository.findById(id).orElseThrow(RuoloNotFoundException::new); }
}
