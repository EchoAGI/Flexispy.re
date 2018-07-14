package com.vvt.preference;

import java.io.Serializable;

public class PrefHomeNumber
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = -296230688957738057L;
  
  public int getMaxCapacity()
  {
    return 5;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.HOME_NUMBER;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefHomeNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */