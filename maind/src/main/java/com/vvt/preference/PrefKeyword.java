package com.vvt.preference;

import java.io.Serializable;

public class PrefKeyword
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = 4278537741148779282L;
  
  public int getMaxCapacity()
  {
    return 5;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.KEYWORD;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefKeyword.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */