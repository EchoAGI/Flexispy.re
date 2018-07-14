package com.vvt.remotecommand.exception;

public class LiscenseDisableException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "License is disabled.";
  private static final long serialVersionUID = -4087325771533672944L;
  
  public LiscenseDisableException()
  {
    super("License is disabled.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/LiscenseDisableException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */