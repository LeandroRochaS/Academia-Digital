package com.dio.leandro.academia.service.impl;

import com.dio.leandro.academia.entity.Matricula;
import com.dio.leandro.academia.entity.dto.MatriculaFormDTO;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaFormDTO form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);

}
