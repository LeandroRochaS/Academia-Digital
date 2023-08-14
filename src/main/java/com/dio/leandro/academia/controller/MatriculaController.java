package com.dio.leandro.academia.controller;

import com.dio.leandro.academia.entity.Matricula;
import com.dio.leandro.academia.entity.dto.MatriculaFormDTO;
import com.dio.leandro.academia.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public List<Matricula> getAll(){
        return matriculaService.getAll();
    }

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaFormDTO form){
        return matriculaService.create(form);
    }
}
