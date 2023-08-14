package com.dio.leandro.academia.service;

import com.dio.leandro.academia.entity.Aluno;
import com.dio.leandro.academia.entity.AvaliacaoFisica;
import com.dio.leandro.academia.entity.dto.AlunoReturnDTO;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaFormDTO;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaReturnDTO;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaUpdateDTO;
import com.dio.leandro.academia.repository.AlunoRepository;
import com.dio.leandro.academia.repository.AvaliacaoFisicaRepository;
import com.dio.leandro.academia.service.impl.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class AvaliacaoFisicaService implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaFormDTO form) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(form.getAlunoId());
        if (alunoOptional.isEmpty()) {
            return null;
        }
        Aluno aluno = alunoOptional.get();

        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        avaliacao.setAluno(aluno);
        avaliacao.setPeso(form.getPeso());
        avaliacao.setAltura(form.getAltura());


        return avaliacaoFisicaRepository.save(avaliacao); // Retorne a avaliação criada

    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisicaReturnDTO> getAll() {
        List<AvaliacaoFisica> avaliacoes = avaliacaoFisicaRepository.findAll();
        List<AvaliacaoFisicaReturnDTO> dtos = new ArrayList<>();

        for (AvaliacaoFisica avaliacao : avaliacoes) {
            AvaliacaoFisicaReturnDTO dto = new AvaliacaoFisicaReturnDTO();
            dto.setId(avaliacao.getId());

            AlunoReturnDTO alunoDTO = new AlunoReturnDTO();
            alunoDTO.setId(avaliacao.getAluno().getId());
            alunoDTO.setNome(avaliacao.getAluno().getNome());
            dto.setAluno(alunoDTO);

            dto.setDataDaAvaliacao(avaliacao.getDataDaAvalicao());
            dto.setPeso(avaliacao.getPeso());
            dto.setAltura(avaliacao.getAltura());

            dtos.add(dto);
        }

        return dtos;
    }


    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
