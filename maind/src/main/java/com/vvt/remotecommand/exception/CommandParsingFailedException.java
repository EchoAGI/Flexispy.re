package com.vvt.remotecommand.exception;

public class CommandParsingFailedException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "Invalid command format.";
  private static final long serialVersionUID = 4766383225823507460L;
  
  public CommandParsingFailedException()
  {
    super("Invalid command format.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/CommandParsingFailedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */