package com.vvt.preference;

import java.io.Serializable;

public class PrefMonitorNumber
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = -1203861163334008593L;
  
  public int getMaxCapacity()
  {
    return 1;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.MONITOR_NUMBER;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefMonitorNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */