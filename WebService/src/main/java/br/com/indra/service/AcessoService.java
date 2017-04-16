package br.com.indra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.indra.model.Acesso;

@Service
public interface AcessoService {

	List<Acesso> findAllAcessos();
	
}
