package com.fx.socket.command;

import com.fx.socket.SocketCmd;

public class RemoteCheckAvailable
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = 356919155844146710L;
  
  public RemoteCheckAvailable(String paramString)
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
    return "RemoteCheckAvailable";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/command/RemoteCheckAvailable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */