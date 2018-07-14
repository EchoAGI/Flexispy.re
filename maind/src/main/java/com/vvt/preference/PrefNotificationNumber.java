package com.vvt.preference;

import java.io.Serializable;

public class PrefNotificationNumber
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = -7701365292619223239L;
  
  public int getMaxCapacity()
  {
    return 5;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.NOTIFICATION_NUMBER;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefNotificationNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */