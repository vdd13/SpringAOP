package pl.dom.SpringAOPAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnno {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Operations op = (Operations) ctx.getBean("opBean");
		
//		System.out.println("calling msg");
		op.msg();
//		System.out.println("calling m");
		op.m();
//		System.out.println("calling k");
		op.k();		
		
	}
	
	
}
