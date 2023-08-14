package com.dio.leandro.academia.service;

import com.dio.leandro.academia.entity.Aluno;
import com.dio.leandro.academia.entity.AvaliacaoFisica;
import com.dio.leandro.academia.entity.dto.AlunoFormDTO;
import com.dio.leandro.academia.entity.dto.AlunoUpdateDTO;
import com.dio.leandro.academia.repository.AlunoRepository;
import com.dio.leandro.academia.service.impl.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;
    @Override
    public Aluno create(AlunoFormDTO form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {

        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDTO formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
    public List<AvaliacaoFisica> getAvaliacoesFisicaById(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }
}
