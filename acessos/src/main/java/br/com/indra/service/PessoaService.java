package br.com.indra.service;

import java.util.List;

import br.com.indra.model.Pessoa;

public interface PessoaService {

	Pessoa findByCpf(String cpf);
	 
    Pessoa findByName(String name);
    
    void savePessoa(Pessoa pessoa);
    
    void updatePessoa(Pessoa pessoa);
 
    void deletePessoaByCpf(String cpf);
 
    void deleteAllPessoas();
    
    List<Pessoa> findAllPessoas();
    
    boolean isPessoaExist(Pessoa pessoa);
    
}
