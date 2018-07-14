package com.vvt.preference;

import java.io.Serializable;
import java.util.HashMap;

public class FxPreferenceList
  implements Serializable
{
  private static final long serialVersionUID = -1726159069116120022L;
  private HashMap preferences;
  
  public FxPreferenceList()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.preferences = localHashMap;
  }
  
  public HashMap getPreferences()
  {
    return this.preferences;
  }
  
  public void setPreferences(HashMap paramHashMap)
  {
    this.preferences = paramHashMap;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/FxPreferenceList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */