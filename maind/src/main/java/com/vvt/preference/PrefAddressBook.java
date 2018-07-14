package com.vvt.preference;

import com.vvt.base.FxAddressbookMode;
import com.vvt.base.FxWaitingForApprovalPolicy;
import java.io.Serializable;

public class PrefAddressBook
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 1945828402836775455L;
  private FxWaitingForApprovalPolicy mFxWaitingForApprovalPolicy;
  private FxAddressbookMode mMode;
  
  public PrefAddressBook()
  {
    Object localObject = FxWaitingForApprovalPolicy.ALLOWED;
    this.mFxWaitingForApprovalPolicy = ((FxWaitingForApprovalPolicy)localObject);
    localObject = FxAddressbookMode.MONITOR;
    this.mMode = ((FxAddressbookMode)localObject);
  }
  
  public FxAddressbookMode getMode()
  {
    return this.mMode;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.ADDRESSBOOK;
  }
  
  public FxWaitingForApprovalPolicy getWaitingForApprovalPolicy()
  {
    return this.mFxWaitingForApprovalPolicy;
  }
  
  public void setMode(FxAddressbookMode paramFxAddressbookMode)
  {
    this.mMode = paramFxAddressbookMode;
  }
  
  public void setWaitingForApprovalPolicy(FxWaitingForApprovalPolicy paramFxWaitingForApprovalPolicy)
  {
    this.mFxWaitingForApprovalPolicy = paramFxWaitingForApprovalPolicy;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefAddressBook.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */