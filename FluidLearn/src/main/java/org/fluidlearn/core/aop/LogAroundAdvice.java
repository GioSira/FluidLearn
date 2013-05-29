package org.fluidlearn.core.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	// Log prima dell'invocazione del metodo
	public Object invoke(MethodInvocation method) throws Throwable {

		System.out.println("[DEBUG-invoke] " + "\tpackage:" + method.getClass()
				+ "." + method.getClass().getName() + "\n\tArgomenti: "
				+ Arrays.toString(method.getArguments()));

		Object result = null;

		try {
			// invoco il metodo
			result = method.proceed();
		} catch (Exception e) {
			// Log eccezione ritornata
			System.out.println("\tErrore: " + e.getMessage());
		}

		// Log del risultato dell'invocazione del metodo
		System.out.println("\tRisultato: " + result);

		return result;
	}

}
