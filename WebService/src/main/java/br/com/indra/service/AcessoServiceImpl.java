package br.com.indra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import br.com.indra.model.Acesso;
import br.com.indra.repository.AcessoRepository;

@Service
@Transactional
public class AcessoServiceImpl implements AcessoService{

	@Autowired
	private AcessoRepository acessoRepository;

	
	@Override
	public List<Acesso> findAllAcessos() {
		return (List<Acesso>) acessoRepository.findAll();
	}

}
