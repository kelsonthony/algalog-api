package com.kelsonthony.algalog.domain.service;

import org.springframework.stereotype.Service;

import com.kelsonthony.algalog.domain.exception.EntidadeNaoEncontradaException;
import com.kelsonthony.algalog.domain.model.Entrega;
import com.kelsonthony.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntegraService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
