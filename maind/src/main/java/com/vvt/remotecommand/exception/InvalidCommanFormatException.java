package com.vvt.remotecommand.exception;

public class InvalidCommanFormatException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "Invalid command format.";
  private static final long serialVersionUID = -8633238876621503813L;
  
  public InvalidCommanFormatException()
  {
    super("Invalid command format.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/InvalidCommanFormatException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */