package br.com.indra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.indra.model.Pessoa;
import br.com.indra.repositories.PessoaRepository;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa findByCpf(String cpf) {
		return pessoaRepository.findOne(cpf);
	}

	public Pessoa findByName(String name) {
		return pessoaRepository.findByNome(name);
	}

	public void savePessoa(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}

	public void updatePessoa(Pessoa pessoa) {
		savePessoa(pessoa);
	}

	public void deletePessoaByCpf(String cpf) {
		pessoaRepository.delete(cpf);
	}

	public void deleteAllPessoas() {
		pessoaRepository.deleteAll();
	}

	public List<Pessoa> findAllPessoas() {
		return pessoaRepository.findAll();
	}

	public boolean isPessoaExist(Pessoa pessoa) {
		return findByName(pessoa.getNome()) != null;
	}

}
