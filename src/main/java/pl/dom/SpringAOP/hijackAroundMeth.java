package pl.dom.SpringAOP;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class hijackAroundMeth implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("Nazwa met");
		invocation.getMethod().getName();
		System.out.println("Argumenty : " + Arrays.toString(invocation.getArguments()));
		
		System.out.println("hijack Before meth");
		
		try {
			invocation.proceed();
			
			System.out.println("hijack After meth");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception "  + e);
			throw e;
		}
		
		return null;
	}

}
