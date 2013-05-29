package org.fluidlearn.core.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice {

	// Log prima delle invocazioni di un metodo
	public void before(Method method, Object[] args, Object target) {

		System.out.println("[DEBUG-before] " + "\tpackage: "
				+ target.getClass() + "." + method.getName()
				+ "\n\tArgomenti: " + Arrays.toString(args));

	}

}
