package org.fluidlearn.core.aop;

import org.springframework.aop.ThrowsAdvice;

public class LogThrowAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("[DEBUG-error] " + "\tErrore: " + e.getMessage());
	}

}
