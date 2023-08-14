package com.dio.leandro.academia.service.impl;

import com.dio.leandro.academia.entity.AvaliacaoFisica;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaFormDTO;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaReturnDTO;
import com.dio.leandro.academia.entity.dto.AvaliacaoFisicaUpdateDTO;

import java.util.List;

public interface IAvaliacaoFisicaService{

  AvaliacaoFisica create(AvaliacaoFisicaFormDTO form);

  AvaliacaoFisica get(Long id);

  List<AvaliacaoFisicaReturnDTO> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO formUpdate);

  void delete(Long id);

  }
