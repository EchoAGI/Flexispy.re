package com.vvt.callmanager.ref;

import java.io.Serializable;

public class MonitorDisconnectData
  implements Serializable
{
  private static final long serialVersionUID = -6865786725409344143L;
  private String number;
  private MonitorDisconnectData.Reason reason;
  
  public MonitorDisconnectData(String paramString, MonitorDisconnectData.Reason paramReason)
  {
    this.number = paramString;
    this.reason = paramReason;
  }
  
  public static long getSerialversionuid()
  {
    return -6865786725409344143L;
  }
  
  public String getNumber()
  {
    return this.number;
  }
  
  public MonitorDisconnectData.Reason getReason()
  {
    return this.reason;
  }
  
  public void setNumber(String paramString)
  {
    this.number = paramString;
  }
  
  public void setReason(MonitorDisconnectData.Reason paramReason)
  {
    this.reason = paramReason;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.number;
    arrayOfObject[0] = localObject;
    localObject = this.reason;
    arrayOfObject[1] = localObject;
    return String.format("number: %s, reason: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/MonitorDisconnectData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */