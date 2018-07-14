package com.vvt.remotecontrol.output;

import java.io.Serializable;

public class RmtCtrlOutputDiagnostics$LastConnection
  implements Serializable
{
  private static final long serialVersionUID = -2371156978111611659L;
  private String apn;
  private String statusCode;
  private long timeMs;
  
  public String getApn()
  {
    return this.apn;
  }
  
  public String getStatusCode()
  {
    return this.statusCode;
  }
  
  public long getTimeMs()
  {
    return this.timeMs;
  }
  
  public void setApn(String paramString)
  {
    this.apn = paramString;
  }
  
  public void setStatusCode(String paramString)
  {
    this.statusCode = paramString;
  }
  
  public void setTimeMs(long paramLong)
  {
    this.timeMs = paramLong;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputDiagnostics$LastConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */