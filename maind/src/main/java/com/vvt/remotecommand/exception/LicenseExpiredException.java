package com.vvt.remotecommand.exception;

public class LicenseExpiredException
  extends RemoteCommandException
{
  public static final String DESCRIPTION = "License is expired.";
  private static final long serialVersionUID = 100413019908589168L;
  
  public LicenseExpiredException()
  {
    super("License is expired.");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/LicenseExpiredException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */