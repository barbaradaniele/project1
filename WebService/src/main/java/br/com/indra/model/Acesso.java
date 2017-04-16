package br.com.indra.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "acesso")
public class Acesso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acesso")
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_hora")
	private Calendar dataHora;
	
	@Column(name = "tipo_acesso")
	private Long tipoAcesso;
	
	@ManyToOne
	@JoinColumn(name="fk_funcionario_id_funcionario")
	private Funcionario funcionario;
	
	@ManyToOne
	@JoinColumn(name="fk_visitante_id_visitante")
	private Visitante visitante;
	
	@ManyToOne
	@JoinColumn(name="fk_morador_id_morador")
	private Morador morador;
	
	public Calendar getDataHora() {
		return dataHora;
	}

	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipoAcesso() {
		return tipoAcesso;
	}

	public void setTipoAcesso(Long tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}
	
	@Override
	public String toString() {
		return "Acesso [id=" + id + ", dataHora=" + dataHora + ", tipoAesso=" + tipoAcesso + ", funcionario=" + funcionario + ", visitante=" + visitante + ", morador=" + morador + "]";
	}
	
}
