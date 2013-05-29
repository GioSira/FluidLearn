package org.fluidlearn.core.aop;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {

	@Before("execution(public * org.fluidlearn.*.*(..))")
	// Log prima delle invocazioni di un metodo
	public void before(JoinPoint jp) {

		System.out.println("[DEBUG-before] " + "\tpackage: "
				+ jp.getTarget().getClass() + "." + jp.getSignature().getName()
				+ "\n\tArgomenti: " + Arrays.toString(jp.getArgs()));

	}

	@AfterReturning(pointcut = "execution(public * org.fluidlearn.*.*(..)))", returning = "returnValue")
	// Log dopo le invocazioni di un metodo
	public void afterReturning(JoinPoint jp, Object returnValue)
			throws Throwable {
		System.out.println("[DEBUG-after] " + "\tpackage: "
				+ jp.getTarget().getClass() + "." + jp.getSignature().getName()
				+ "\n\tRisultato= " + returnValue);
	}

	@AfterThrowing("execution(* *.*(..))")
	public void afterThrowing(JoinPoint jp) throws Throwable {
		System.out.println("[DEBUG-error] " + "\tErrore: "
				+ jp.getSignature().getName());
	}

}
