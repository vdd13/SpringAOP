package pl.dom.SpringAOPAnnotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track {

	@Pointcut("execution(* Operations.m*(..))")
	public void k() {

	}
	
	
	@Before("k()")
	public void myAdvice(JoinPoint jp) {
		
		System.out.println("comment - track");
	}

	
	
	
}
