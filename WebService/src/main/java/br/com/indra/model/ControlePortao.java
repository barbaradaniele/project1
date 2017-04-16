package br.com.indra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "controle_portao")
public class ControlePortao {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_controle_portao" )
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "fk_veiculo_placa")
	private Veiculo veiculo;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	@Override
	public String toString() {
		return "ControlePortao [id=" + id + ", veiculo=" + veiculo + "]";
	}
	
}
