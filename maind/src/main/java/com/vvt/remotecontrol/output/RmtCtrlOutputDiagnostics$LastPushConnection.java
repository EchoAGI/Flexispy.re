package com.vvt.remotecontrol.output;

import java.io.Serializable;

public class RmtCtrlOutputDiagnostics$LastPushConnection
  implements Serializable
{
  private static final long serialVersionUID = -4349782841619257607L;
  private String m_ConnectionType;
  private long m_Date;
  private String m_Msg;
  private String m_PushProtocal;
  private String m_Status;
  private int m_StatusCode;
  
  public String getConnectionStatus()
  {
    return this.m_Status;
  }
  
  public int getConnectionStatusCode()
  {
    return this.m_StatusCode;
  }
  
  public String getConnectionType()
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
  
  public String getProtocolType()
  {
    return this.m_PushProtocal;
  }
  
  public void setConnectionStatus(String paramString)
  {
    this.m_Status = paramString;
  }
  
  public void setConnectionStatusCode(int paramInt)
  {
    this.m_StatusCode = paramInt;
  }
  
  public void setConnectionType(String paramString)
  {
    this.m_ConnectionType = paramString;
  }
  
  public void setDate(long paramLong)
  {
    this.m_Date = paramLong;
  }
  
  public void setMessage(String paramString)
  {
    this.m_Msg = paramString;
  }
  
  public void setProtocolType(String paramString)
  {
    this.m_PushProtocal = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputDiagnostics$LastPushConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */