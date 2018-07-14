package com.vvt.remotecommand.exception;

public class ProcessingTimeoutException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "Processing timeout.";
  private static final long serialVersionUID = 6120741095912629667L;
  
  public ProcessingTimeoutException()
  {
    super("Processing timeout.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/ProcessingTimeoutException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */