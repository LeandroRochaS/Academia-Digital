package com.dio.leandro.academia.service.impl;

import com.dio.leandro.academia.entity.Aluno;
import com.dio.leandro.academia.entity.AvaliacaoFisica;
import com.dio.leandro.academia.entity.dto.AlunoFormDTO;
import com.dio.leandro.academia.entity.dto.AlunoUpdateDTO;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoFormDTO form);


    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateDTO formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAvaliacoesFisicaById(Long id);

}
