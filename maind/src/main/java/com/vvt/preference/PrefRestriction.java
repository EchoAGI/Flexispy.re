package com.vvt.preference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class PrefRestriction
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 1572972015526403388L;
  private boolean isBeingRestricted;
  private boolean isEnabled;
  private boolean isRestrictedDay;
  private HashSet restrictedTimeFrames;
  private ArrayList restrictions;
  
  public PrefRestriction()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.restrictions = localArrayList;
  }
  
  public HashSet getRestrictedTimeFrames()
  {
    return this.restrictedTimeFrames;
  }
  
  public ArrayList getRestrictions()
  {
    return this.restrictions;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.RESTRICTION;
  }
  
  public boolean isBeingRestricted()
  {
    return this.isBeingRestricted;
  }
  
  public boolean isEnabled()
  {
    return this.isEnabled;
  }
  
  public boolean isRestrictedDay()
  {
    return this.isRestrictedDay;
  }
  
  public void setBeingRestricted(boolean paramBoolean)
  {
    this.isBeingRestricted = paramBoolean;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.isEnabled = paramBoolean;
  }
  
  public void setRestrictedDay(boolean paramBoolean)
  {
    this.isRestrictedDay = paramBoolean;
  }
  
  public void setRestrictedTimeFrames(HashSet paramHashSet)
  {
    this.restrictedTimeFrames = paramHashSet;
  }
  
  public void setRestrictions(ArrayList paramArrayList)
  {
    this.restrictions = paramArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefRestriction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */