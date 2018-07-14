package com.vvt.remotecommand.exception;

public class WrongActivationCodeException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "Wrong activation code.";
  private static final long serialVersionUID = 1541279197609806022L;
  
  public WrongActivationCodeException()
  {
    super("Wrong activation code.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/WrongActivationCodeException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */