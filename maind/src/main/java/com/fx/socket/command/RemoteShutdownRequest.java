package com.fx.socket.command;

import com.fx.socket.SocketCmd;

public class RemoteShutdownRequest
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = -2496224502733043435L;
  
  public RemoteShutdownRequest(String paramString)
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
    return "RemoteShutdownRequest";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/command/RemoteShutdownRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */