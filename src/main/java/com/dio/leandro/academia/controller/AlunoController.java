package com.dio.leandro.academia.controller;

import com.dio.leandro.academia.entity.Aluno;
import com.dio.leandro.academia.entity.AvaliacaoFisica;
import com.dio.leandro.academia.entity.dto.AlunoFormDTO;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaReturnDTO;
import com.dio.leandro.academia.service.AlunoService;
import com.dio.leandro.academia.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento){

        return alunoService.getAll(dataDeNascimento );
    }

    @PostMapping
    private Aluno create(@Valid @RequestBody AlunoFormDTO form){
        return alunoService.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAvaliacoesFisicaById(@PathVariable Long id){
        return alunoService.getAvaliacoesFisicaById(id);
    }

}
