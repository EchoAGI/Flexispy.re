package com.vvt.preference;

import java.io.Serializable;

public class PrefWatchList
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = 6653741389083300601L;
  private boolean isEnabled;
  private int watchFlag;
  
  public int getMaxCapacity()
  {
    return 10;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.WATCH_LIST;
  }
  
  public int getWatchFlag()
  {
    return this.watchFlag;
  }
  
  public boolean isEnabled()
  {
    return this.isEnabled;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.isEnabled = paramBoolean;
  }
  
  public void setWatchFlag(int paramInt)
  {
    this.watchFlag = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefWatchList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */