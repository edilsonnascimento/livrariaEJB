package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class AuditoriaInterceptadorTeste {
	
	@AroundInvoke
	public Object audita(InvocationContext context) throws Exception{
			
		System.out.println("3");
		
		System.out.println("4");
		
		return null;
	}

}
