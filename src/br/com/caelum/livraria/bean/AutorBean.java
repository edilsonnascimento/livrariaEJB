package br.com.caelum.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;

import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.service.AutorService;
import br.com.caelum.livraria.service.LivrariaException;

import javax.inject.Inject;

@Model
public class AutorBean {

    private Autor autor = new Autor();

    @Inject
    private AutorService autorService;

    public Autor getAutor() {
        return autor;
    }

    public void cadastra(){
    	
    	autorService.adiciona(autor);    	
        this.autor = new Autor();
    }

    public List<Autor> getAutores() {
        return autorService.todosAutores();
    }
}
