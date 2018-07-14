package com.fx.socket.command;

import java.io.Serializable;

public class RemoteSetSync$SyncData
  implements Serializable
{
  private static final long serialVersionUID = 2693185931577984454L;
  private String clientPackage;
  private boolean isSync;
  
  public String getClientPackage()
  {
    return this.clientPackage;
  }
  
  public boolean isSync()
  {
    return this.isSync;
  }
  
  public void setClientPackage(String paramString)
  {
    this.clientPackage = paramString;
  }
  
  public void setSync(boolean paramBoolean)
  {
    this.isSync = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/fx/socket/command/RemoteSetSync$SyncData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */