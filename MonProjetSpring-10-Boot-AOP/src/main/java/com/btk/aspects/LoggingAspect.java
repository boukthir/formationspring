package com.btk.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before(value = "execution(* com.btk.service.Calcul.*(..))")
	public void logBefore(JoinPoint point) {
		System.out.println(">>>>>LOG :  A l'entrée de la methode..." + point.getSignature().getName());

	}

//	@After(value = "execution(* com.btk.service.Calcul.*(..))")
//	public void logAfter(JoinPoint point) {
//		System.out.println(">>>>>LOG :  A la sortie de methode..." + point.getSignature().getName());
//	}

	@AfterReturning(value = "execution(* com.btk.service.Calcul.*(..))", returning = "res")
	public void logAfter(JoinPoint point, int res) {
		System.out.println(
				">>>>>LOG :  A la sortie de methode..." + point.getSignature().getName() + "le resultat est :  " + res);
	}

}
