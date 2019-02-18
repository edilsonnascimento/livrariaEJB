package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptorTeste {
	
	@AroundInvoke
	public Object loga(InvocationContext context) throws Exception {
		
		System.out.println("1");
		
		Object retorno = context.proceed();
		
		System.out.println("2");
		
		
		return retorno;
	}

}
