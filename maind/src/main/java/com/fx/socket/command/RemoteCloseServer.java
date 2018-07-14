package com.fx.socket.command;

import com.fx.socket.SocketCmd;

public class RemoteCloseServer
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = 371030171387996393L;
  
  public RemoteCloseServer(String paramString)
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
    return "RemoteCloseServer";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/command/RemoteCloseServer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */