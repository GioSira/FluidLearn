package it.html.spring.aop;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice {
	
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// Log prima dell'invocazione del metodo
		System.out.println("[" + new Date() + "]\n\t" 
				+  target.getClass() + "."  +  method.getName()
				+  "\n\tArgomenti: "+ Arrays.toString(args));		
	}

}
