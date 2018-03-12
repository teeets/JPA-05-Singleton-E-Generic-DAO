package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SORVETE")
@SequenceGenerator(name="sorvete",sequenceName="SQ_T_SORVETE",allocationSize=1)
public class Sorvete {

	@Id
	@Column(name="cd_sorvete")
	@GeneratedValue(generator="sorvete",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_sabor",nullable=false,length=50)
	private String sabor;
	
	@Column(name="vl_preco",nullable=false)
	private double preco;
	
	public Sorvete() {
		super();
	}

	public Sorvete(String sabor, double preco) {
		super();
		this.sabor = sabor;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
