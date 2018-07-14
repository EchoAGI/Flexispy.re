package com.vvt.shell;

public enum CannotGetRootShellException$Reason
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/shell/CannotGetRootShellException$Reason;
    ((Reason)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (Reason)localObject;
    localObject = new com/vvt/shell/CannotGetRootShellException$Reason;
    ((Reason)localObject).<init>("SU_EXEC_FAILED", j);
    SU_EXEC_FAILED = (Reason)localObject;
    localObject = new com/vvt/shell/CannotGetRootShellException$Reason;
    ((Reason)localObject).<init>("SYSTEM_WRITE_FAILED", i);
    SYSTEM_WRITE_FAILED = (Reason)localObject;
    localObject = new Reason[3];
    Reason localReason = UNKNOWN;
    localObject[0] = localReason;
    localReason = SU_EXEC_FAILED;
    localObject[j] = localReason;
    localReason = SYSTEM_WRITE_FAILED;
    localObject[i] = localReason;
    a = (Reason[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/CannotGetRootShellException$Reason.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */