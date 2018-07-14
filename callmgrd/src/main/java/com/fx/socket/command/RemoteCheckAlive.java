package com.fx.socket.command;

import com.fx.socket.SocketCmd;

public class RemoteCheckAlive
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = -4924766994872831800L;
  
  public RemoteCheckAlive(String paramString)
  {
    super(null, Boolean.class);
    a = paramString;
  }
  
  protected String getServerName()
  {
    return a;
  }
  
  protected String getTag()
  {
    return "RemoteCheckAlive";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/command/RemoteCheckAlive.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */