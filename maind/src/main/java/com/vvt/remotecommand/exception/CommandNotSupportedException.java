package com.vvt.remotecommand.exception;

public class CommandNotSupportedException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "Wrong command code or command not registered.";
  private static final long serialVersionUID = 6194836380241588096L;
  
  public CommandNotSupportedException()
  {
    super("Wrong command code or command not registered.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/CommandNotSupportedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */