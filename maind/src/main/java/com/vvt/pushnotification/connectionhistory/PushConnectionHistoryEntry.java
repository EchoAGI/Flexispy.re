package com.vvt.pushnotification.connectionhistory;

import java.io.Serializable;

public class PushConnectionHistoryEntry
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private ConnectionType m_ConnectionType;
  private long m_Date;
  private String m_Msg;
  private PushProtocal m_PushProtocal;
  private Status m_Status;
  private int m_StatusCode;
  
  public ConnectionType getConnectionType()
  {
    return this.m_ConnectionType;
  }
  
  public long getDate()
  {
    return this.m_Date;
  }
  
  public String getMessage()
  {
    return this.m_Msg;
  }
  
  public PushProtocal getPushProtocal()
  {
    return this.m_PushProtocal;
  }
  
  public Status getStatus()
  {
    return this.m_Status;
  }
  
  public int getStatusCode()
  {
    return this.m_StatusCode;
  }
  
  public void setConnectionType(ConnectionType paramConnectionType)
  {
    this.m_ConnectionType = paramConnectionType;
  }
  
  public void setDate(long paramLong)
  {
    this.m_Date = paramLong;
  }
  
  public void setMessage(String paramString)
  {
    this.m_Msg = paramString;
  }
  
  public void setPushProtocal(PushProtocal paramPushProtocal)
  {
    this.m_PushProtocal = paramPushProtocal;
  }
  
  public void setStatus(Status paramStatus)
  {
    this.m_Status = paramStatus;
  }
  
  public void setStatusCode(int paramInt)
  {
    this.m_StatusCode = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/connectionhistory/PushConnectionHistoryEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */