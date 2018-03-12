package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_FORNECEDOR")
public class Fornecedor {

	@Id
	@Column(name="nr_cnpj")
	private String cnpj;
	
	@Column(name="nm_fornecedor",nullable=false)
	private String nome;
	
	public Fornecedor(String cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public Fornecedor() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
