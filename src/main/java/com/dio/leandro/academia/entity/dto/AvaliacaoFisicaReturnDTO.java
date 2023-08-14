package com.dio.leandro.academia.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaReturnDTO {
    private Long id;
    private AlunoReturnDTO aluno;
    private LocalDateTime dataDaAvaliacao;
    private double peso;
    private double altura;

}
