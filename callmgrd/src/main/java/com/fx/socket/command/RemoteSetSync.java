package com.fx.socket.command;

import com.fx.socket.SocketCmd;

public class RemoteSetSync
  extends SocketCmd
{
  private static String a;
  private static final long serialVersionUID = 307412736898318237L;
  
  public RemoteSetSync(String paramString, RemoteSetSync.SyncData paramSyncData)
  {
    super(paramSyncData, Boolean.class);
    a = paramString;
  }
  
  protected String getServerName()
  {
    return a;
  }
  
  protected String getTag()
  {
    return "RemoteSetSync";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/command/RemoteSetSync.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */