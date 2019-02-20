package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Livro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LivroDao {
    
	@PersistenceContext
	EntityManager manager;
	
    public void salva(Livro livro) {
        manager.persist(livro);
    }

    public List<Livro> todosLivros() {
        return manager.createQuery("SELECT l FROM Livro l", Livro.class)
        		.getResultList();
    }

	public List<Livro> todosLivrosPeloNome(String nome) {
		
		return manager.createQuery("SELECT l FROM Livro l WHERE l.titulo like :pTitulo", Livro.class)
				.setParameter("pTitulo", "%" + nome + "%")
				.getResultList();
	}

}
