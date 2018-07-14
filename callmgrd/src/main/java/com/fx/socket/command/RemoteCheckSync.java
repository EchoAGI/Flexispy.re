package com.fx.socket.command;

import com.fx.socket.SocketCmd;

public class RemoteCheckSync
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = 8097922490892284490L;
  
  public RemoteCheckSync(String paramString1, String paramString2)
  {
    super(paramString2, Boolean.class);
    a = paramString1;
  }
  
  protected String getServerName()
  {
    return a;
  }
  
  protected String getTag()
  {
    return "RemoteCheckSync";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/command/RemoteCheckSync.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */