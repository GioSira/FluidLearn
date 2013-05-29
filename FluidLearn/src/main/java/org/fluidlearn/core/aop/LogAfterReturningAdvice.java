package org.fluidlearn.core.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice {

	// Log dopo le invocazioni di un metodo
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("[DEBUG-after] " + "\tRisultato: " + returnValue);
	}

}
