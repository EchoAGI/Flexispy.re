package com.vvt.remotecommand.exception;

public class InvalidPhoneNumberException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "Invalid phone number.";
  private static final long serialVersionUID = -7728553606207596215L;
  
  public InvalidPhoneNumberException()
  {
    super("Invalid phone number.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/InvalidPhoneNumberException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */