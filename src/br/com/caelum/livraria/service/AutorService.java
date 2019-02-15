package br.com.caelum.livraria.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {

	@Inject
	AutorDao autorDao;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void adiciona(Autor autor) {		
		autorDao.salva(autor);
		throw new RuntimeException(
				"[ERRO] ERRO LANCADO POR TESTAR O ROLLBACK DA TRANSACAO ...");
	}	

	public List<Autor> todosAutores(){
		return autorDao.todosAutores();
		
	}
}
