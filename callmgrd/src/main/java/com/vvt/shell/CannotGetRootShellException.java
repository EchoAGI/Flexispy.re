package com.vvt.shell;

public class CannotGetRootShellException
  extends Exception
{
  private static final long serialVersionUID = 1L;
  private CannotGetRootShellException.Reason mReason;
  
  public CannotGetRootShellException(CannotGetRootShellException.Reason paramReason)
  {
    CannotGetRootShellException.Reason localReason = CannotGetRootShellException.Reason.UNKNOWN;
    this.mReason = localReason;
    this.mReason = paramReason;
  }
  
  public CannotGetRootShellException(String paramString)
  {
    super(paramString);
    CannotGetRootShellException.Reason localReason = CannotGetRootShellException.Reason.UNKNOWN;
    this.mReason = localReason;
  }
  
  public CannotGetRootShellException.Reason getReason()
  {
    return this.mReason;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/CannotGetRootShellException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */