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
	@NotNull(message = "tempo é obrigatoria!")
	@Column
  	private double tempo;
	@NotNull(message = "porção é obrigatoria!")
	@Column
  	private double porcao;
	@NotNull(message = "tipo é obrigatorio!")
	@Column
  	private String tipo;
	@NotNull(message = "Ingredientes é obrigatorio!")
	@Column
  	private String ingredientes;
	@NotNull(message = "Modo de preparo é obrigatorio!")
	@Column
  	private String modo;
	

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


	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
