package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Autor;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AutorDao {


	@PersistenceContext
	EntityManager manager;
    
    public void aposCriacao() {
    	System.out.println("[INFO] AutorDAO foi criado...");
    }
    public void salva(Autor autor) {    	
        manager.persist(autor);        
    }

    public List<Autor> todosAutores() {
        return manager.createQuery("SELECT a FROM Autor a", Autor.class)
        		.getResultList();
    }

    public Autor buscaPelaId(Integer autorId) {
        return manager.find(Autor.class, autorId);        		
    }

}
