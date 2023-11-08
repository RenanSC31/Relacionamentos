package com.relacionamentos2e.relacionamentos2e.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="telefone")
public class Telefone {
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int ddd;
	private int numero;
	
	@ManyToOne// Muitos telefone para 1 pessoa
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
	private boolean CodStatus;

	public long getId() {
		return id;
	}

	public boolean isCodStatus() {
		return CodStatus;
	}

	public void setCodStatus(boolean codStatus) {
		CodStatus = codStatus;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
