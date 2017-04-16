package br.com.indra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "visitante")
@Entity
public class Visitante {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_visitante")
	private Long id;
	private String empresa_servico;
	
	@ManyToOne
	@JoinColumn(name="fk_pessoa_cpf")
	private Pessoa pessoa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpresa_servico() {
		return empresa_servico;
	}
	public void setEmpresa_servico(String empresa_servico) {
		this.empresa_servico = empresa_servico;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Override
	public String toString() {
		return "Visitante [id=" + id + ", pessoa=" + pessoa + "]";
	}
	
}
