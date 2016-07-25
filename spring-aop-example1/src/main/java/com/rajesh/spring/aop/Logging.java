package com.rajesh.spring.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Logging {

	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void beforeAdvice(final JoinPoint joinPoint) {
		Logger beforeAdviceLogger = Logger.getLogger(joinPoint.getThis().getClass());
		beforeAdviceLogger.info("Start of method:" + joinPoint.getSignature().getName());
		beforeAdviceLogger.info("Method Args List.");
		beforeAdviceLogger.info("Method arguments:{" + Arrays.toString(joinPoint.getArgs()) + "}");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	public void afterAdvice(final JoinPoint joinPoint) {
		Logger afterAdviceLogger = Logger.getLogger(joinPoint.getThis().getClass());
		afterAdviceLogger.info("This is handle while method while returnning...");
		afterAdviceLogger.info("End of method:" + joinPoint.getSignature().getName());
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */

	public void afterReturningAdvice(final JoinPoint joinPoint, final Object retVal) {
		Logger afterReturningAdviceLogger = Logger.getLogger(joinPoint.getThis().getClass());
		afterReturningAdviceLogger.info(joinPoint.getSignature().getName()+" Returning value:"+retVal);
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */

	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}

	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

		Logger aroundAdviceLogger = Logger.getLogger(joinPoint.getThis().getClass());
		long stTime = System.currentTimeMillis();
		aroundAdviceLogger.info("Start time of method:" + joinPoint.getSignature().getName()+" = "+stTime);

		joinPoint.proceed(); //continue on the intercepted method
		
		long endTime = System.currentTimeMillis();
		aroundAdviceLogger.info("End time of method:" + joinPoint.getSignature().getName()+" = "+endTime);
		aroundAdviceLogger.info("Total time of method:" + joinPoint.getSignature().getName()+" = "+(endTime-stTime)+" ms");
	   }

}