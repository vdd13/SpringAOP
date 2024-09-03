package pl.dom.SpringAOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class hijackAfterMeth implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("To jest After hijack :D");
	}

	
}
