package it.html.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;;

public class LogAfterReturningAdvice implements AfterReturningAdvice {
		
	// Log del risultato dell'invocazione del metodo
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("\tRisultato: "+ returnValue);	
	}
	
}
