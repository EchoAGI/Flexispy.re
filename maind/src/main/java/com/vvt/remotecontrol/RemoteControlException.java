package com.vvt.remotecontrol;

public class RemoteControlException
  extends Exception
{
  public static final String MSG_APP_ENGINE_NOT_AVAILABLE = "AppEngine1 not available.";
  public static final String MSG_CANNOT_ADD_DUPLICATED_ITEM = "Cannot add phone number to %s list. Duplicate phone number.";
  public static final String MSG_CANNOT_ADD_INVALID_PHONE_NUMBER = "Cannot add phone number to %s list. Invalid phone number.";
  public static final String MSG_CANNOT_ADD_MAX_CAPACITY = "Cannot add phone number to %s list. Maximum capacity reached.";
  public static final String MSG_CANNOT_ADD_URL_MAX_CAPACITY = "Cannot add url to list. Maximum capacity reached.";
  public static final String MSG_EXPECTED_DATA_MISSING = "Expected data missing.";
  public static final String MSG_FUNCTION_NOT_REGISTERED = "Function not registered.";
  public static final String MSG_FUNCTION_NOT_SPECIFIED = "Function not specified.";
  public static final String MSG_FUNCTION_NOT_SUPPORTED = "Function not supported.";
  public static final String MSG_INVALID_UR = "Invalid url %s.";
  public static final String MSG_UNEXPECTED_ERROR_OCCURRED = "Unexpected error found.";
  private static final long serialVersionUID = -6103486215307512150L;
  public Throwable mCause;
  
  public RemoteControlException(String paramString)
  {
    super(paramString);
  }
  
  public RemoteControlException(Throwable paramThrowable)
  {
    super(paramThrowable);
    this.mCause = paramThrowable;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/RemoteControlException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */