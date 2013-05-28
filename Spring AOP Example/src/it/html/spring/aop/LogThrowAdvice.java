package it.html.spring.aop;

import org.springframework.aop.ThrowsAdvice;

public class LogThrowAdvice implements ThrowsAdvice {
	
	// Log dell'eccezione ritornata dal metodo
	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("\tErrore: " + e.getMessage());
	}

}
