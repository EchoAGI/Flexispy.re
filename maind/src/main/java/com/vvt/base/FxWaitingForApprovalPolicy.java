package com.vvt.base;

public enum FxWaitingForApprovalPolicy
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/base/FxWaitingForApprovalPolicy;
    ((FxWaitingForApprovalPolicy)localObject).<init>("ALLOWED", 0);
    ALLOWED = (FxWaitingForApprovalPolicy)localObject;
    localObject = new com/vvt/base/FxWaitingForApprovalPolicy;
    ((FxWaitingForApprovalPolicy)localObject).<init>("NOT_ALLOWED", i);
    NOT_ALLOWED = (FxWaitingForApprovalPolicy)localObject;
    localObject = new FxWaitingForApprovalPolicy[2];
    FxWaitingForApprovalPolicy localFxWaitingForApprovalPolicy = ALLOWED;
    localObject[0] = localFxWaitingForApprovalPolicy;
    localFxWaitingForApprovalPolicy = NOT_ALLOWED;
    localObject[i] = localFxWaitingForApprovalPolicy;
    a = (FxWaitingForApprovalPolicy[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/FxWaitingForApprovalPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */