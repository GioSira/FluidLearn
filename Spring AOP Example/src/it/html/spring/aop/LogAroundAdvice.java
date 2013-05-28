package it.html.spring.aop;

import java.util.Arrays;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		// Log prima dell'invocazione del metodo
		System.out.println("[" + new Date() + "]\n\t" 
				+  methodInvocation.getThis().getClass() + "."  +  methodInvocation.getMethod().getName()
				+  "\n\tArgomenti: "+ Arrays.toString(methodInvocation.getArguments()));	
					
		Object result = null;		
		try {
			// invocazione metodo	
			result = methodInvocation.proceed();	
		}
		catch (Exception ex) {
			// Log dell'eccezione ritornata dal metodo
			System.out.println("\tErrore: " + ex.getMessage());
		}
		
		// Log del riusultato dell'invocazione del metodo
		System.out.println("\tRisultato: "+ result);
				
		return result;
	}

}
