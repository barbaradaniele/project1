package br.com.indra.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo {

	@Id
	private String placa;
	
	@OneToOne
	@JoinColumn(name = "fk_apartamento_id_apartamento")
	private Apartamento apartamento;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", apartamento=" + apartamento + "]";
	}
	
}
