package com.vvt.remotecommand.exception;

public class RequiresRootException
  extends RemoteCommandException
{
  public static final String NORMAL_DESCRIPTION = "The setting has been changed, however this feature requires root permission.";
  public static final String SPECIFIED_ROOT_DESCRIPTION = "This feature requires root permission.";
  private static final long serialVersionUID = 1541279197609806022L;
  
  public RequiresRootException(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/exception/RequiresRootException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */