package com.vvt.connectionhistorymanager;

import java.io.Serializable;

public class ConnectionHistoryEntry
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String m_APN;
  private int m_CommandCode;
  private ConnectionType m_ConnectionType;
  private long m_Date;
  private ErrorType m_ErrorType;
  private String m_Msg;
  private Status m_Status;
  private int m_StatusCode;
  
  public String getAPN()
  {
    return this.m_APN;
  }
  
  public int getAction()
  {
    return this.m_CommandCode;
  }
  
  public ConnectionType getConnectionType()
  {
    return this.m_ConnectionType;
  }
  
  public long getDate()
  {
    return this.m_Date;
  }
  
  public ErrorType getErrorType()
  {
    return this.m_ErrorType;
  }
  
  public String getMessage()
  {
    return this.m_Msg;
  }
  
  public Status getStatus()
  {
    return this.m_Status;
  }
  
  public int getStatusCode()
  {
    return this.m_StatusCode;
  }
  
  public void setAPN(String paramString)
  {
    this.m_APN = paramString;
  }
  
  public void setAction(int paramInt)
  {
    this.m_CommandCode = paramInt;
  }
  
  public void setConnectionType(ConnectionType paramConnectionType)
  {
    this.m_ConnectionType = paramConnectionType;
  }
  
  public void setDate(long paramLong)
  {
    this.m_Date = paramLong;
  }
  
  public void setErrorType(ErrorType paramErrorType)
  {
    this.m_ErrorType = paramErrorType;
  }
  
  public void setMessage(String paramString)
  {
    this.m_Msg = paramString;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/connectionhistorymanager/ConnectionHistoryEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */