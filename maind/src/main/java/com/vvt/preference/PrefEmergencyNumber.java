package com.vvt.preference;

import java.io.Serializable;

public class PrefEmergencyNumber
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = 3520241499959741617L;
  
  public int getMaxCapacity()
  {
    return 5;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.EMERGENCY_NUMBER;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefEmergencyNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */