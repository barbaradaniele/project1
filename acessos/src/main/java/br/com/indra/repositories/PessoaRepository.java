package br.com.indra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.indra.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String> {

	Pessoa findByNome(String nome);
}
