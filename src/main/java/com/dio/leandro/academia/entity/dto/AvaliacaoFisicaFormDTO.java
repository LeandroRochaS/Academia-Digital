package com.dio.leandro.academia.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaFormDTO {
    private Long alunoId;
    private double peso;
    private double altura;
}
