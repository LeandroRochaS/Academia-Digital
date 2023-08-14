package com.dio.leandro.academia.service;

import com.dio.leandro.academia.entity.Aluno;
import com.dio.leandro.academia.entity.Matricula;
import com.dio.leandro.academia.entity.dto.MatriculaFormDTO;
import com.dio.leandro.academia.repository.AlunoRepository;
import com.dio.leandro.academia.repository.MatriculaRepository;
import com.dio.leandro.academia.service.impl.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public Matricula create(MatriculaFormDTO form) {
       Matricula matricula = new Matricula();
       Aluno aluno = alunoRepository.findById(form.getIdAluno()).get();
       matricula.setAluno(aluno);

       return matriculaRepository.save(matricula);

    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}
