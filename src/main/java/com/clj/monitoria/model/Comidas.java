package com.clj.monitoria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Comidas {
	@Id
	@GeneratedValue
    private Long id;
	@NotNull(message = "nome é obrigatoria!")
	@Column
	private String nome;
	@NotNull(message = "descrição é obrigatoria!")
	@Column
    private String descricao; 
	@NotNull(message = "tempo é obrigatoria!")
	@Column
  	private double tempo;
	@NotNull(message = "porção é obrigatoria!")
	@Column
  	private double porcao;
	

  	public double getPorcao() {
  		return porcao;
  	}
  	public void setPorcao(double porcao) {
  		this.porcao = porcao;
  	}
  	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome	;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	
}
