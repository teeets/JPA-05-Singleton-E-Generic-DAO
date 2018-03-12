package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.jpa.dao.FornecedorDAO;
import br.com.fiap.jpa.entity.Fornecedor;

public class FornecedorDAOImpl 
		extends GenericDAOImpl<Fornecedor, String>
							implements FornecedorDAO{

	public FornecedorDAOImpl(EntityManager em) {
		super(em);
	}

}
