package br.com.indra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "digital")
@Entity
public class Digital {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_digital")
	private Long id;
	private String mao;
	private String dedo;
	
	@JoinColumn(name = "fk_morador_id_morador")
	@ManyToOne
	private Morador morador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMao() {
		return mao;
	}

	public void setMao(String mao) {
		this.mao = mao;
	}

	public String getDedo() {
		return dedo;
	}

	public void setDedo(String dedo) {
		this.dedo = dedo;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}
	
	@Override
	public String toString() {
		return "Digital [id=" + id + ", mao=" + mao + ", dedo" + dedo + ", morador" + morador + "]";
	}
}
