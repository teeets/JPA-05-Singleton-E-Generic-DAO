package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import br.com.fiap.jpa.dao.SorveteDAO;
import br.com.fiap.jpa.dao.impl.SorveteDAOImpl;
import br.com.fiap.jpa.entity.Sorvete;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.KeyNotFoundException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class SorvereTeste {

	public static void main(String[] args) throws KeyNotFoundException {
		
		
		//Criada EntityMannegerer Factory e instanciando com sigleton
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		//Cadastrar
		Sorvete sorvete = new Sorvete("Chocolate Belga" ,15);
		SorveteDAO dao = new SorveteDAOImpl(em);
		
	
		try {
			dao.create(sorvete);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		//Buscar
		Sorvete search = dao.read(sorvete.getCodigo());
		System.out.println(search.getSabor());
		
		
		//Atualizar
		search.setSabor("Chocolate Belga com doce de leite");
						
		
		try {
			dao.update(search);
			dao.commit();
		} catch (CommitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Remover
		
		try {
			dao.delete(search.getCodigo());
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
				
		em.close();
		fabrica.close();
		
	}

}
