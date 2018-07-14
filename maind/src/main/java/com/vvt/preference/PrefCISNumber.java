package com.vvt.preference;

import java.io.Serializable;

public class PrefCISNumber
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = 54291708234080558L;
  
  public int getMaxCapacity()
  {
    return 5;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.CIS_NUMBER;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefCISNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */