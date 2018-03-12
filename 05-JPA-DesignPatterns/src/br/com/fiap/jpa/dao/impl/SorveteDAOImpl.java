package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.jpa.dao.SorveteDAO;
import br.com.fiap.jpa.entity.Sorvete;

public class SorveteDAOImpl 
		extends GenericDAOImpl<Sorvete, Integer>
							implements SorveteDAO{

	public SorveteDAOImpl(EntityManager em) {
		super(em);
	}

}
