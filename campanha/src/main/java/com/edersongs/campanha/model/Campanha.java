/**
 * 
 */
package com.edersongs.campanha.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Éderson Gervásio
		   edersongervasiosilva@gmail.com
		   github.com/edersongs	
 *
 */
@Entity
@Table(name = "TCAMPANHA")
public class Campanha implements Serializable {

	private static final long serialVersionUID = -8891928089382144125L;

	@Id
	@Column(name = "codcamp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "codtimcor")
	private Long codigoTimeCoracao;
	
	@NotBlank(message = "Nome da campanha não informado!")
	@Column(name = "nomcamp")
	private String nome;
	
	@Column(name = "dtvig")
	private Date vigencia;
	
	public Long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public Long getCodigoTimeCoracao() {
		return codigoTimeCoracao;
	}
	
	public void setCodigoTimeCoracao(Long codigoTimeCoracao) {
		this.codigoTimeCoracao = codigoTimeCoracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getVigencia() {
		return vigencia;
	}
	
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Campanha other = (Campanha) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return codigo + " - " + nome;
	}
}
