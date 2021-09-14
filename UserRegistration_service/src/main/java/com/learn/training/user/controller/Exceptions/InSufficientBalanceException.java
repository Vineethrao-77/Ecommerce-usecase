package com.learn.training.user.controller.Exceptions;
public class InSufficientBalanceException extends RuntimeException
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InSufficientBalanceException()
  {
	  super();
  }
  public InSufficientBalanceException(String message)
  {
	  super(message);
  }
  
  public InSufficientBalanceException(String message, Throwable t)
  {
	  super(message,t);
  }
  
  
}
