package com.kelsonthony.algalog.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kelsonthony.algalog.domain.model.Entrega;
import com.kelsonthony.algalog.domain.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {

	private BuscaEntegraService buscaIntegraService;
	
	@Transactional
	public Ocorrencia registrar(Long entregaId, String descricao) {
		Entrega entrega = buscaIntegraService.buscar(entregaId);
		
		return entrega.adicionarOcorrencia(descricao);
	}
}
