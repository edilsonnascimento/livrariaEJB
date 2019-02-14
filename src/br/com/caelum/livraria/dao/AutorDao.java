package br.com.caelum.livraria.dao;

import java.util.List;

import br.com.caelum.livraria.modelo.Autor;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AutorDao {

    @Inject
	private Banco banco;

    
    public void aposCriacao() {
    	System.out.println("[INFO] AutorDAO foi criado...");
    }
    public void salva(Autor autor) {
    	
    	System.out.println("[INFO} Salvando Autor: " + autor.getNome());
    	
    	try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
        banco.save(autor);
        
        System.out.println("[INFO] Salvo Autor: " + autor.getNome());
    }

    public List<Autor> todosAutores() {
        return banco.listaAutores();
    }

    public Autor buscaPelaId(Integer autorId) {
        Autor autor = this.banco.buscaPelaId(autorId);
        return autor;
    }

}
