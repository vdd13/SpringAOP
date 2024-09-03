package pl.dom.SpringAOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class hijackBeforeMeth implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("TO jest hijack before metod");
	}

	
	
}
