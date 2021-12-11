package com.heroes.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "heroes")
public class Heroes {

	@Id
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "universo")
	private String universo;
	
	@Column(name = "filmes")
	private Integer filme;
	
	@Column(name = "poderes")
	private String poderes;
	
	
	public Heroes() {
		
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
		this.nome = nome;
	}


	public String getUniverso() {
		return universo;
	}


	public void setUniverso(String universo) {
		this.universo = universo;
	}


	public Integer getFilme() {
		return filme;
	}


	public void setFilme(Integer filme) {
		this.filme = filme;
	}


	public String getPoderes() {
		return poderes;
	}


	public void setPoderes(String poderes) {
		this.poderes = poderes;
	}
	
	
}
