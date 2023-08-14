package com.dio.leandro.academia.controller;

import com.dio.leandro.academia.entity.AvaliacaoFisica;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaFormDTO;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaReturnDTO;
import com.dio.leandro.academia.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaService service;

    @PostMapping
    private AvaliacaoFisica create(@RequestBody AvaliacaoFisicaFormDTO form){
        return service.create(form);
    }

    @GetMapping
    private List<AvaliacaoFisicaReturnDTO> getAll(){
        return service.getAll();
    }
}
