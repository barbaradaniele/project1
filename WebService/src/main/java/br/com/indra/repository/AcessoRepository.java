package br.com.indra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.indra.model.Acesso;

@Repository
public interface AcessoRepository extends JpaRepository<Acesso, Long> {

	Acesso findById(Long id);
}
