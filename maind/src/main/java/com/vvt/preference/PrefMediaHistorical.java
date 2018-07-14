package com.vvt.preference;

import java.io.Serializable;

public class PrefMediaHistorical
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 7392206901886999556L;
  private int mediaFlag;
  
  public int getMediaFlag()
  {
    return this.mediaFlag;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.MEDIA_HISTORICAL;
  }
  
  public void setWatchFlag(int paramInt)
  {
    this.mediaFlag = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefMediaHistorical.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */