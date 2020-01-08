package fr.ldnr.thomas.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class ChronoAspect {
	public Object ecrire(ProceedingJoinPoint pjp) throws Throwable{
		final Long tmp = System.nanoTime();
		
//		System.out.println("chrono = ");
		Object obj = pjp.proceed();
		Long tmp2 =  System.nanoTime()-tmp;
		System.out.println(pjp.getSignature() + " temps " +tmp2);
		return obj;
	}

}
