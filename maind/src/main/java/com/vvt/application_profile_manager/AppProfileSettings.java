package com.vvt.application_profile_manager;

import java.io.Serializable;
import java.util.HashSet;

class AppProfileSettings
  implements Serializable
{
  private static final long serialVersionUID = 4066261345613919098L;
  private boolean allowUnknown = true;
  private HashSet allowingApps;
  private HashSet blockingApps;
  private boolean isCaptureEnabled;
  private boolean isProfileEnabled;
  long refId;
  
  public HashSet getAllowingApps()
  {
    HashSet localHashSet = this.allowingApps;
    if (localHashSet == null)
    {
      localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      this.allowingApps = localHashSet;
    }
    return this.allowingApps;
  }
  
  public HashSet getBlockingApps()
  {
    HashSet localHashSet = this.blockingApps;
    if (localHashSet == null)
    {
      localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      this.blockingApps = localHashSet;
    }
    return this.blockingApps;
  }
  
  public long getRefId()
  {
    return this.refId;
  }
  
  public boolean isAllowUnknown()
  {
    return this.allowUnknown;
  }
  
  public boolean isCaptureEnabled()
  {
    return this.isCaptureEnabled;
  }
  
  public boolean isProfileEnabled()
  {
    return this.isProfileEnabled;
  }
  
  public void setAllowUnknown(boolean paramBoolean)
  {
    this.allowUnknown = paramBoolean;
  }
  
  public void setCaptureEnabled(boolean paramBoolean)
  {
    this.isCaptureEnabled = paramBoolean;
  }
  
  public void setProfileEnabled(boolean paramBoolean)
  {
    this.isProfileEnabled = paramBoolean;
  }
  
  public void setRefId(long paramLong)
  {
    this.refId = paramLong;
  }
  
  public String toString()
  {
    String str1 = "capture: %s (ref: %d), profile: %s, unknown: %s)";
    Object[] arrayOfObject = new Object[4];
    int i = 0;
    Long localLong = null;
    boolean bool = this.isCaptureEnabled;
    if (bool)
    {
      str2 = "ENABLED";
      arrayOfObject[0] = str2;
      long l = this.refId;
      localLong = Long.valueOf(l);
      arrayOfObject[1] = localLong;
      i = 2;
      bool = this.isProfileEnabled;
      if (!bool) {
        break label108;
      }
      str2 = "ENABLED";
      label68:
      arrayOfObject[i] = str2;
      i = 3;
      bool = this.allowUnknown;
      if (!bool) {
        break label115;
      }
    }
    label108:
    label115:
    for (String str2 = "ALLOW";; str2 = "DISALLOW")
    {
      arrayOfObject[i] = str2;
      return String.format(str1, arrayOfObject);
      str2 = "DISABLED";
      break;
      str2 = "DISABLED";
      break label68;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/application_profile_manager/AppProfileSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */