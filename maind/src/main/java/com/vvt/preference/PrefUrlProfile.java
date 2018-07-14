package com.vvt.preference;

import java.io.Serializable;

public class PrefUrlProfile
  extends a
  implements Serializable
{
  private static final long serialVersionUID = -1258167998726299695L;
  boolean isEnabled;
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.URL_PROFILE;
  }
  
  public boolean isEnabled()
  {
    return this.isEnabled;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.isEnabled = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefUrlProfile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */