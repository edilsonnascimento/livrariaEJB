package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class LogInterceptador {
	
	@AroundInvoke
	public Object intercepta(InvocationContext context) throws Exception{
		long mills = System.currentTimeMillis();
		
		Object object = context.proceed();		
		
		System.out.println("Tempo Gasto: " + context.getTarget().getClass().getSimpleName() + "." + context.getMethod().getName() + " : " + (System.currentTimeMillis() - mills) + " Miles Segundos");
		
		return object;
	}

}
