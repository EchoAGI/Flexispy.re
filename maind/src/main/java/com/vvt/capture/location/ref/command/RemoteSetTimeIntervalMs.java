package com.vvt.capture.location.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteSetTimeIntervalMs
  extends SocketCmd
{
  private static final long serialVersionUID = 1611245956612666075L;
  
  public RemoteSetTimeIntervalMs(long paramLong)
  {
    super(localLong, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.psysd";
  }
  
  protected String getTag()
  {
    return "RemoteSetTimeIntervalMs";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/ref/command/RemoteSetTimeIntervalMs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */