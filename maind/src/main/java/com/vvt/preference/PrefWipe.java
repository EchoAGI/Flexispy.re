package com.vvt.preference;

import java.io.Serializable;

public class PrefWipe
  extends a
  implements Serializable
{
  private static final long serialVersionUID = -2757402458339898216L;
  private boolean isWipe;
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.WIPE;
  }
  
  public boolean isWiped()
  {
    return this.isWipe;
  }
  
  public void setWipe(boolean paramBoolean)
  {
    this.isWipe = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefWipe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */