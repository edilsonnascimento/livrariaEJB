package br.com.caelum.livraria.dao;

import br.com.caelum.livraria.modelo.Usuario;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UsuarioDao {


	@PersistenceContext
	EntityManager manager;
	
    public Usuario buscaPeloLogin(String login) {
        return manager.createQuery("SELECT u FROM Usuario u WHERE u.login = :pLogin", Usuario.class)
        		.setParameter("pLogin", login)
        		.getSingleResult();
    }

}
