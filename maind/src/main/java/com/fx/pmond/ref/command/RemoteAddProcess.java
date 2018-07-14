package com.fx.pmond.ref.command;

import com.fx.daemon.util.WatchingProcess;
import com.fx.socket.SocketCmd;

public class RemoteAddProcess
  extends SocketCmd
{
  private static final long serialVersionUID = -46535609642003099L;
  
  public RemoteAddProcess(WatchingProcess paramWatchingProcess)
  {
    super(paramWatchingProcess, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.pmond";
  }
  
  protected String getTag()
  {
    return "RemoteAddProcess";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/pmond/ref/command/RemoteAddProcess.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */