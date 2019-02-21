package br.com.caelum.livraria.service;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {

	
	@Schedule(hour="*", minute="*", second="*/5", persistent=false)
	public void TestaAgendadro() {
		
		Date data = new Date(System.currentTimeMillis());  
		SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		System.out.println("[INFO] MOSTRA DATA DE EXECUÇÃO: " + formatarDate.format(data));
	}
}
