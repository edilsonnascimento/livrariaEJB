package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Autor;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER) // Opicional
public class AutorDao {


	@PersistenceContext
	EntityManager manager;
    
    public void aposCriacao() {
    	System.out.println("[INFO] AutorDAO foi criado...");
    }
    
//    @TransactionAttribute(TransactionAttributeType.REQUIRED) //Opcional
//    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void salva(Autor autor) {    	
        manager.persist(autor);
        
//        throw new RuntimeException("Serviço externo deu erro!");
    }
    

    public List<Autor> todosAutores() {
        return manager.createQuery("SELECT a FROM Autor a", Autor.class)
        		.getResultList();
    }

    public Autor buscaPelaId(Integer autorId) {
        return manager.find(Autor.class, autorId);        		
    }

}
