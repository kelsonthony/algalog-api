package com.kelsonthony.algalog.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kelsonthony.algalog.domain.model.Entrega;
import com.kelsonthony.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {
	
	private EntregaRepository entregaRepository;
	private BuscaEntegraService buscaEntegraService;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntegraService.buscar(entregaId);
		
//		if ( entrega.podeSerFinalizada() ) {
//			entrega.finalizar();
//		}
//		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}
}
