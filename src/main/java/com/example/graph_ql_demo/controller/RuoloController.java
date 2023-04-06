package com.example.graph_ql_demo.controller;


import com.example.graph_ql_demo.dto.RuoloDTO;
import com.example.graph_ql_demo.enumeration.RuoloEnum;
import com.example.graph_ql_demo.mapper.RuoloMapper;
import com.example.graph_ql_demo.service.RuoloService;
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
    private RuoloService service;

    @QueryMapping
    public List<RuoloDTO> getAllRuoli() {
        return service.findAll();
    }

    @QueryMapping
    public RuoloDTO getRuolo(@Argument RuoloEnum roleEnum) {
        return service.findByNome(roleEnum);
    }
}
