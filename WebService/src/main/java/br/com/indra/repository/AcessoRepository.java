package br.com.indra.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.indra.model.Acesso;

@Transactional
public interface AcessoRepository extends JpaRepository<Acesso, Long> {

}
