package com.fx.socket.command;

import com.fx.socket.SocketCmd;

public class RemoteNotifyProcessCrash
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = -4924766994872831800L;
  
  public RemoteNotifyProcessCrash(String paramString1, String paramString2)
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
    return "RemoteNotifyProcessCrash";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/socket/command/RemoteNotifyProcessCrash.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */