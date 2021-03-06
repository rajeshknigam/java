package com.rajesh.spring.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class Security {
	/**
	 * This is the method which I would like to execute before a selected method
	 * execution.
	 */
	public void beforeSecurity(final JoinPoint joinPoint) {
		Logger beforeAdviceLogger = Logger.getLogger(joinPoint.getThis().getClass());
		beforeAdviceLogger.info("Start of method:" + joinPoint.getSignature().getName());
		beforeAdviceLogger.info("Method Args List.");
		beforeAdviceLogger.info("Method arguments:{" + Arrays.toString(joinPoint.getArgs()) + "}");
	}

	/**
	 * This is the method which I would like to execute after a selected method
	 * execution.
	 */
	public void afterSecurity(final JoinPoint joinPoint) {
		Logger afterAdviceLogger = Logger.getLogger(joinPoint.getThis().getClass());
		afterAdviceLogger.info("This is handle while method while returnning...");
		afterAdviceLogger.info("End of method:" + joinPoint.getSignature().getName());
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */

	public void afterReturningSecurity(final JoinPoint joinPoint, final Object retVal) {
		Logger afterReturningAdviceLogger = Logger.getLogger(joinPoint.getThis().getClass());
		afterReturningAdviceLogger.info(joinPoint.getSignature().getName()+" Returning value:"+retVal);
	}

	/**
	 * This is the method which I would like to execute if there is an exception
	 * raised.
	 */

	public void AfterThrowingSecurity(IllegalArgumentException ex) {
		System.out.println("There has been an exception: " + ex.toString());
	}
}