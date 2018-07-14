package com.vvt.preference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PrefTemporalControl
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 8284281014642303154L;
  private boolean isBeingRestricted;
  private boolean isRestrictedDay;
  private HashMap mStatus;
  private HashSet temporalControlTimeFrames;
  private ArrayList temporalControls;
  
  public PrefTemporalControl()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.temporalControls = ((ArrayList)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.mStatus = ((HashMap)localObject);
  }
  
  public HashSet getTemporalControlTimeFrames()
  {
    return this.temporalControlTimeFrames;
  }
  
  public ArrayList getTemporalControls()
  {
    return this.temporalControls;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.TEMPORAL_CONTROL;
  }
  
  public boolean isBeingRestricted()
  {
    return this.isBeingRestricted;
  }
  
  public boolean isCapture(Integer paramInteger)
  {
    Object localObject = this.mStatus;
    boolean bool = ((HashMap)localObject).containsKey(paramInteger);
    if (bool)
    {
      localObject = (Boolean)this.mStatus.get(paramInteger);
      bool = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean isRestrictedDay()
  {
    return this.isRestrictedDay;
  }
  
  public void setBeingRestricted(boolean paramBoolean)
  {
    this.isBeingRestricted = paramBoolean;
  }
  
  public void setCapture(Integer paramInteger, boolean paramBoolean)
  {
    HashMap localHashMap = this.mStatus;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localHashMap.put(paramInteger, localBoolean);
  }
  
  public void setRestrictedDay(boolean paramBoolean)
  {
    this.isRestrictedDay = paramBoolean;
  }
  
  public void setTemporalControlTimeFrames(HashSet paramHashSet)
  {
    this.temporalControlTimeFrames = paramHashSet;
  }
  
  public void setTemporalControls(ArrayList paramArrayList)
  {
    this.temporalControls = paramArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefTemporalControl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */