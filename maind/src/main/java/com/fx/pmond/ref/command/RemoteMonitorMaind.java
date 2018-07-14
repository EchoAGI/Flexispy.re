package com.fx.pmond.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteMonitorMaind
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = 662396663254416879L;
  
  public RemoteMonitorMaind(String paramString, RemoteMonitorMaind.MonitorData paramMonitorData)
  {
    super(paramMonitorData, Boolean.class);
    a = paramString;
  }
  
  protected String getServerName()
  {
    return a;
  }
  
  protected String getTag()
  {
    return "RemoteMonitorMaind";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/pmond/ref/command/RemoteMonitorMaind.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */